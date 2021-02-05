import sys
from antlr4 import *
from gcode2Parser import gcode2Parser
from gcode2Listener import gcode2Listener
from antlr4.error.ErrorListener import *
import io

class gcode2ErrorListener(ErrorListener):
  def __init__(self, output):
    self.output = output        
    self._symbol = []
    
  def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):        
    self.output.write(msg)
    self._symbol.append(offendingSymbol.text)

  @property        
  def symbol(self):
    return self._symbol