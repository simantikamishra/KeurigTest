package com.keurig.util;
import java.util.*;
import com.keurig.base.*;
public class utl extends Keurig
{
	public static void winPopUpClose()
	{
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1:handles)
		{
			driver.switchTo().window(handle1);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(handle1.equals(handle))
		{
			continue;
		}
		else driver.close();
}
}
}
