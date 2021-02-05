from antlr4 import *
from gcode2Lexer import gcode2Lexer
from gcode2Parser import gcode2Parser
from Txtgcode2Listener import Txtgcode2Listener
from gcode2ErrorListener import gcode2ErrorListener
import unittest
import io

class Testgcode2Parser(unittest.TestCase):
  def setup(self, text):        
    lexer = gcode2Lexer(InputStream(text))        
    stream = CommonTokenStream(lexer)
    parser = gcode2Parser(stream)
    
    self.output = io.StringIO()
    self.error = io.StringIO()

    parser.removeErrorListeners()        
    errorListener = gcode2ErrorListener(self.error)
    parser.addErrorListener(errorListener)  

    self.errorListener = errorListener              
    
    return parser
      
  def test_valid_gcode(self):
    # exemplo de linha que é válida
    parser = self.setup("N001 G00 X10 Y10\n")
    tree = parser.statement()               

    Txtgcode2 = Txtgcode2Listener(self.output)
    walker = ParseTreeWalker()
    walker.walk(Txtgcode2, tree)              

    # let's check that there aren't any symbols in errorListener  
    self.assertEqual(len(self.errorListener.symbol), 0)

  def test_invalid_gcode(self):
    # exemplo de linha que não é válida
    parser = self.setup("N001 G00 X10 Y10X")
    tree = parser.statement()               

    Txtgcode2 = Txtgcode2Listener(self.output)
    walker = ParseTreeWalker()
    walker.walk(Txtgcode2, tree)              

    # let's check the symbol in errorListener
    self.assertEqual(self.errorListener.symbol[0], 'X')

if __name__ == '__main__':
  unittest.main()