package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;


public class Actionsclass extends BaseClass{
	
	static Actions act=new Actions(driver);
	
	public static void Keyboard() {
		act.keyDown(Keys.SHIFT).sendKeys(prop.getProperty("inputbykeyboard")).keyUp(Keys.SHIFT).build().perform();
	}
	public static void Mtoelememt(WebElement mouseover) {
		act.moveToElement(mouseover).build().perform();
	}
	public static void Mtoclick(WebElement mouseclick) {
		act.click(mouseclick).build().perform();
	}
	public static void Mtorightclick(WebElement mouserightclick) {
		act.contextClick(mouserightclick).build().perform();
	}
	public static void Mtodouldeclick(WebElement mousedoubleclick) {
		act.doubleClick(mousedoubleclick).build().perform();
	}
	public static void Mtodragdrop(WebElement mousedragloc,WebElement mousedroploc) {
		act.dragAndDrop(mousedragloc,mousedroploc).release().build().perform();
	}
	public static void Mtoclickhold(WebElement mousedragloc) {
		act.clickAndHold(mousedragloc).release().build().perform();
	}
	

	

}
