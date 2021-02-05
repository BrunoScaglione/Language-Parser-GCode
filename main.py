import sys
from antlr4 import *
from gcode2Lexer import gcode2Lexer
from gcode2Parser import gcode2Parser
from Txtgcode2Listener import Txtgcode2Listener

def main(argv):
  # txt com código G
  input = FileStream(argv[1])
  lexer = gcode2Lexer(input)
  stream = CommonTokenStream(lexer)
  parser = gcode2Parser(stream)
  tree = parser.prg()
  output = open("output.txt","w")
  
  htmlgcode2 = Txtgcode2Listener(output)
  walker = ParseTreeWalker()
  walker.walk(htmlgcode2, tree)
      
  output.close()      

if __name__ == '__main__':
  main(sys.argv)