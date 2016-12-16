/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.eshark.szj;

import org.eshark.szj.gui.MainWindow;

/**
 * <TABLE BORDER="1" WIDTH="100%">
 * <TR>
 * <TH>Particulars</TH><TH>::</TH><TH>Details</TH>
 * </TR>
 * <TR>
 * <TD>Project Name</TD><TD>::</TD><TD>SearchZipsAndJars</TD>
 * </TR>
 * <TR>
 * <TD>File Name</TD><TD>::</TD><TD>Main.java</TD>
 * </TR>
 * <TR>
 * <TD>Created on</TD><TD>::</TD><TD>Jan 1, 2009 11:42:56 PM</TD>
 * </TR>
 * <TR>
 * <TD>@author</TD><TD>::</TD><TD><a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a></TD>
 * </TR>
 * <TR>
 * <TD>Purpose</TD><TD>::</TD><TD>Entry point of the application.</TD>
 * </TR>
 * <TR>
 * <TD COLSPAN=3></TD>
 * </TR>
 * </TABLE>
 *
 * <TABLE BORDER="1" WIDTH="100%">
 * <CAPTION>File Change History</CAPTION>
 * <TR>
 * <TH>Date</TH><TH>Description</TH>                    |
 * </TR>
 * <TR>
 * <TD>Dec 3, 2008</TD><TD>Created</TD>
 * </TR>
 * </TABLE>
 */
public class Main
{
	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:11:31 PM</strong>
	 * <BR>Purpose <i>To call for the MainWindow in a threadsafe way.</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param mainArguments arguments to the main function
	 */
	public static void main(String[] mainArguments)
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				MainWindow aWindow = new MainWindow();
				aWindow.setVisible(true);
			}
		});
	}

}
