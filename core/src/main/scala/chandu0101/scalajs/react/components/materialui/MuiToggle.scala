package chandu0101.scalajs.react.components
package materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

/**
 * This file is generated - submit issues instead of PR against it
 */
    
case class MuiToggle(
  key:                  js.UndefOr[String]                             = js.undefined,
  ref:                  js.UndefOr[MuiToggleM => Unit]                 = js.undefined,
  /* default:false: The value of the toggle button. Is true when toggle has been turned on. False otherwise.*/
  defaultToggled:       js.UndefOr[Boolean]                            = js.undefined,
  disabled:             js.UndefOr[Boolean]                            = js.undefined,
  /* Overrides the inline-styles of the Toggle element.*/
  elementStyle:         js.UndefOr[CssProperties]                      = js.undefined,
  iconStyle:            js.UndefOr[CssProperties]                      = js.undefined,
  /* default:"left": Where the label will be placed next to the toggle switch. Options include "left" and "right" (case-sensitive). Default option is "left".*/
  labelPosition:        js.UndefOr[LeftRight]                          = js.undefined,
  /* Overrides the inline-styles of the Toggle element label.*/
  labelStyle:           js.UndefOr[CssProperties]                      = js.undefined,
  /* Callback function that is fired when the toggle switch is toggled.*/
  onToggle:             js.UndefOr[(ReactEventI, Boolean) => Callback] = js.undefined,
  rippleStyle:          js.UndefOr[CssProperties]                      = js.undefined,
  thumbStyle:           js.UndefOr[CssProperties]                      = js.undefined,
  toggled:              js.UndefOr[Boolean]                            = js.undefined,
  trackStyle:           js.UndefOr[CssProperties]                      = js.undefined,
  valueLink:            js.UndefOr[js.Any]                             = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  checked:              js.UndefOr[Boolean]                            = js.undefined,
  /* The css class name of the root element.
  (Passed on to EnhancedSwitch)*/
  className:            js.UndefOr[String]                             = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  defaultSwitched:      js.UndefOr[Boolean]                            = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  disableFocusRipple:   js.UndefOr[Boolean]                            = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  disableTouchRipple:   js.UndefOr[Boolean]                            = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  id:                   js.UndefOr[String]                             = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  inputType:            js.UndefOr[String]                             = js.undefined,
  /* The text that is displayed beside the toggle switch.
  (Passed on to EnhancedSwitch)*/
  label:                js.UndefOr[ReactNode]                          = js.undefined,
  /* This is the name of the toggle.
  (Passed on to EnhancedSwitch)*/
  name:                 js.UndefOr[String]                             = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onBlur:               js.UndefOr[ReactEventH => Callback]            = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onFocus:              js.UndefOr[ReactFocusEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onMouseDown:          js.UndefOr[ReactMouseEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onMouseLeave:         js.UndefOr[ReactMouseEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onMouseUp:            js.UndefOr[ReactMouseEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onParentShouldUpdate: js.UndefOr[Boolean => Callback]                = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onSwitch:             js.UndefOr[(ReactEventI, Boolean) => Callback] = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onTouchEnd:           js.UndefOr[ReactTouchEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  onTouchStart:         js.UndefOr[ReactTouchEventH => Callback]       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  required:             js.UndefOr[Boolean]                            = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  rippleColor:          js.UndefOr[MuiColor]                           = js.undefined,
  /* Override the inline-styles of the root element.
  (Passed on to EnhancedSwitch)*/
  style:                js.UndefOr[CssProperties]                      = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  switchElement:        js.UndefOr[ReactElement]                       = js.undefined,
  /* (Passed on to EnhancedSwitch)*/
  switched:             js.UndefOr[Boolean]                            = js.undefined,
  /* The value of our toggle component.
  (Passed on to EnhancedSwitch)*/
  value:                js.UndefOr[String]                             = js.undefined){

  def apply() = {
    val props = JSMacro[MuiToggle](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Toggle)
    f(props).asInstanceOf[ReactComponentU_]
  }
}
        


@js.native
class MuiToggleM extends js.Object {
  /* Returns true if the checkbox is currently checked. Returns false otherwise*/
  def isToggled(): Boolean = js.native

  /* Sets the toggle to the value of newToggledValue. This method cannot be used while "checked" is defined as a property.*/
  def setToggled(newToggledValue: Boolean): Unit = js.native
}
