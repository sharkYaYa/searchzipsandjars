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

package org.eshark.szj.gui.model;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 * <TABLE BORDER="1" WIDTH="100%">
 * <TR>
 * <TH>Particulars</TH><TH>::</TH><TH>Details</TH>
 * </TR>
 * <TR>
 * <TD>Project Name</TD><TD>::</TD><TD>SearchZipsAndJars</TD>
 * </TR>
 * <TR>
 * <TD>File Name</TD><TD>::</TD><TD>ListComboBoxModel.java</TD>
 * </TR>
 * <TR>
 * <TD>Created on</TD><TD>::</TD><TD>Jan 1, 2009 11:42:56 PM</TD>
 * </TR>
 * <TR>
 * <TD>@author</TD><TD>::</TD><TD><a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a></TD>
 * </TR>
 * <TR>
 * <TD>Purpose</TD><TD>::</TD><TD>Provide the model for the zar list</TD>
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
public class ListComboBoxModel extends AbstractListModel implements ComboBoxModel
{
	private static final long	serialVersionUID	= 8267755544917209851L;
	private String				selectedItem;
	private List				mArrayList;

	/**
	 * This creates ListComboBoxModel
	 * @param aList
	 */
	public ListComboBoxModel(List aList)
	{
		mArrayList = aList;
	}

	/* (non-Javadoc)
	 * @see javax.swing.ComboBoxModel#getSelectedItem()
	 * <br>Purpose to override <i></i>
	 *
	 */
	public Object getSelectedItem()
	{
		return selectedItem;
	}

	/* (non-Javadoc)
	 * @see javax.swing.ComboBoxModel#setSelectedItem(java.lang.Object)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public void setSelectedItem(Object aValue)
	{
		selectedItem = (String) aValue;
	}

	/* (non-Javadoc)
	 * @see javax.swing.ListModel#getSize()
	 * <br>Purpose to override <i></i>
	 *
	 */
	public int getSize()
	{
		return mArrayList.size();
	}

	/* (non-Javadoc)
	 * @see javax.swing.ListModel#getElementAt(int)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public Object getElementAt(int i)
	{
		return mArrayList.get(i);
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:05:21 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param i
	 */
	public void remove(int i)
	{
		mArrayList.remove(i);
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:06:13 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aValue
	 */
	public void remove(String aValue)
	{
		mArrayList.remove(aValue);
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:06:08 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aValue
	 */
	public void addItem(String aValue)
	{
		mArrayList.add(aValue);
	}
}
