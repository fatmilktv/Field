(ns clojurelines
  (:import (field.core.plugins.drawing.text AdvancedTextToCachedLine)
           (field.core.dispatch.iVisualElement Rect)
           (field.core.plugins.drawing ConstantDistanceResampling3)
           (field.core.plugins.drawing FieldGraphics2D2)
           (field.core.plugins.drawing opengl)
           (field.core.plugins.drawing.opengl CachedLine)
           (field.core.plugins.drawing.opengl Cursor)
           (field.core.plugins.drawing.opengl.Polar iPolarVisitor)
           (field.core.plugins.drawing.opengl.Polar PathFitter)
           (field.core.plugins.drawing.opengl.Polar PolarFilter)
           (field.core.plugins.drawing.opengl.Polar PolarMove)
           (field.core.plugins.drawing.tweak python)
           (field.core.plugins.drawing.tweak.python iCoordTransformation)
           (field.core.plugins.drawing.tweak Visitors3)
           (field.core.plugins.drawing.tweak.Visitors BaseFilter)
           (field.core.plugins.drawing.tweak.Visitors NodeVisitor)
           (field.core.plugins.drawing.tweak.Visitors PositionFilter)
           (field.core.util PythonCallableMap)
           (field.math.linalg CoordinateFrame)
           (field.math.linalg Quaternion)
           (field.math.linalg Vector2)
           (field.math.linalg Vector3)
           (field.math.linalg Vector4)
           (field.math.util Circumcenter)
           (field.util Dict)
           (field.util.Dict Prop)
           (java.awt BasicStroke)
           (java.awt Font)
           (java.awt.geom Arc2D)
           (java.awt.geom Area)
           (java.awt.geom Ellipse2D)
           (java.lang Double)
           (java.lang Math)
           ;(TweakTools floatRange)
           ;(TweakTools PCursor)
           ;(TweakTools wl)
  )

  ; constructor; java in parens
  (defn CJLine
    c = CachedLine(**kw)
      return c)

  ; python
  (defmacro cl__setattr__ )
  (defmacro cl__call__ )
  (defmacro cl__getattr__ )
 
  (defn moveTo)
  (defn lineTo)
  (defn relLineTo)
  (defn relMoveTo)
  (defn cubicTo)
  (defn relCubicTo)
  (defn polarCubicTo)


  ;(defn polarCubicTo)
  
  ;; tweaks-system here
  (defn addCode)

  (defn rect)

  ;roundRect
  ;ellipse
  ;circle
  ;line

  ;segment
  ;replaceContents
  ;append
  

( comment

(defn FLine(**kw))
(defn cl__setattr__(self, att, to))
(defn cl__call__(self, **kw))
(defn cl__getattr__(self, att))
(defn moveTo(self, *x))
(defn lineTo(self, *x))
(defn cubicTo(self, *x))
(defn relLineTo(self, *x))
(defn relMoveTo(self, *x))
(defn relCubicTo(self, *x))
(defn polarCubicTo(self, a1, len1, a2, len2, x2, y2))
(defn addCode(self, code))
(defn rect(self, x,y,w,h))
(defn roundRect(self, x,y,w,h, radius=5))
(defn ellipse(self, rx, ry, x, y))
(defn circle(self, radius, x, y))
(defn line(self, x1,y1, x2, y2))
(defn segment(self))
(defn replaceContents(self, source, deep=0))
(defn append(self, source, deep=0, merge=1))
(defn clear(self))
(defn copy(self))
(defn remapProperties(self, source))
(defn newLineByStroking(self, thickness=1, join=0, cap=0, miter=10, dashed=0, dash=None, phase=0))
(defn newLineByJoiningEndsWith(self, other))
(defn newLineByReversing(self))
(defn newLineBySubdivision(self))
(defn newLinesBySegmenting(self))
(defn appendVectorText2(self, text, x, y, font="Gill Sans", attributes=0, size=20))
;
  (defn __init__(self, lam): 
	(defn visitPosition(self, pos, part, inside))
	(defn __init__(self, f): self.f = f
	(defn beginSubpath(self, a,b): pass
	(defn visitPolarMove(self, move, inside))
	(defn __init__(self,f): self.f = f
	(defn visitNode(self, before, now, after, beforeIsCurve, afterIsCurve))
;
(defn newLineByFilteringPositions2(self, lam))
(defn newLineByTransformingSpace2(self, transformer, transformDensity=0.1, maxError=1.5))
(defn newLineByFitting2(self, maxError=1.5, resample=0))
(defn newLineByFilteringNodes2(self, f))
(defn newLineByFilteringPolar2(self, f))
(defn filterPositions2(self, lam))
(defn filterNodes2(self, lam))
(defn filterPolar2(self, lam))
;
  (defn __init__(self, lam): 
	(defn visitPosition(self, pos, part, inside))
	(defn __init__(self,f): self.f = f
	(defn visitNode(self, before, now, after, beforeIsCurve, afterIsCurve))
;
(defn newLineByFilteringPositions(self, lam))
(defn newLineByFilteringNodes(self, f))
(defn filterPositions(self, lam))
(defn filterNodes(self, lam))
(defn newLineByResampling(self, targetNum, rough=1))
(defn bounds2(self, fast=1))
(defn bounds(self))
(defn __iadd__(self, translation))
(defn appendShape(self, shape))
(defn arc(self, radius, x, y, start, end, join=0))
(defn arcTo(self, cx, cy, p2x, p2y))
(defn arcThrough(self, p1x, p1y, p2x, p2y))
(defn __and__(self, otherLine))
(defn __or__(self, otherLine))
(defn __sub__(self, otherLine))
(defn toArea2(self))
(defn fromArea2(self, area))
(defn __imul__(self, translation))
(defn cursor(self, at=0))
(defn cursorAtPosition(self, position))
(defn pointsOfIntersection2(self, otherLine))
(defn doIntersection2(self, otherLine))
(defn position(self))
(defn points(self))
(defn setPoints(self, *p))
(defn setPosition(self, *p))
(defn setControl1(self, *p))
(defn setControl2(self, *p))
(defn control1(self))
(defn control2(self))
(defn  isCubic(self))
(defn isConnected(self))
(defn position2(self))
(defn __iadd__(self, translation))
(defn previous(self))
(defn next(self))
(defn head(self))
(defn CFrame(r=Quaternion(), s=Vector3(1,1,1), t=Vector3(0,0,0), center=None))
(defn __call__(self, r=None, s=None,t=None))
(defn __getattr__(self, name))
(defn __setattr__(self, name, value))
(defn __mul__(self, other))
(defn __add__(self, other))
(defn __call__(self, **kw))
) ;end comment

)
