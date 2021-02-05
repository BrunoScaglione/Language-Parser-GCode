import sys
from antlr4 import *
from gcode2Parser import gcode2Parser
from gcode2Listener import gcode2Listener

class Txtgcode2Listener(gcode2Listener) :

  def __init__(self, output):
    self.output = output
    # self.output.write('<html><head><meta charset="UTF-8"/></head><body>')

  # Exit a parse tree produced by gcode2Parser#coordx.
  def exitCoordx(self, ctx):
    txt = ctx.getText()
    number = txt.strip("X")
    number = number + ' '
    self.output.write(number)

  # Exit a parse tree produced by gcode2Parser#coordy.
  def exitCoordy(self, ctx):
    txt = ctx.getText()
    number = txt.strip("Y")
    number = number + '\n'
    self.output.write(number)
