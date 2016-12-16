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

import javax.swing.table.AbstractTableModel;
import java.util.List;
import javax.swing.table.TableModel;


/**
 * <TABLE BORDER="1" WIDTH="100%">
 * <TR>
 * <TH>Particulars</TH><TH>::</TH><TH>Details</TH>
 * </TR>
 * <TR>
 * <TD>Project Name</TD><TD>::</TD><TD>SearchZipsAndJars</TD>
 * </TR>
 * <TR>
 * <TD>File Name</TD><TD>::</TD><TD>BasicTableModel.java</TD>
 * </TR>
 * <TR>
 * <TD>Created on</TD><TD>::</TD><TD>Jan 1, 2009 11:42:56 PM</TD>
 * </TR>
 * <TR>
 * <TD>@author</TD><TD>::</TD><TD><a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a></TD>
 * </TR>
 * <TR>
 * <TD>Purpose</TD><TD>::</TD><TD>Provides the model for the Result tables.</TD>
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
public class BasicTableModel extends AbstractTableModel
{
	private static final long	serialVersionUID	= 5386994152301246258L;
	protected String[]			mColumnNames		= null;
	protected List				mRows				= null;

	/**
	 * This creates BasicTableModel
	 * @param aColumnNames
	 * @param aRows
	 */
	public BasicTableModel(String[] aColumnNames, List aRows)
	{
		mRows = aRows;
		mColumnNames = aColumnNames;
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:02:11 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aRow
	 */
	public void addRow(String[] aRow)
	{
		if (aRow.length != 2)
			return;
		mRows.add(aRow);
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:02:16 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 */
	public void clear()
	{
		mRows.clear();
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:02:22 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @return
	 */
	public TableModel getModel()
	{
		return this;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public Object getValueAt(int aRow, int aColumn)
	{
		// System.out.println("Value  " + mRows);
		// System.out.println("Value Size " + mRows.size());
		if (mRows == null || mRows.size() < aRow)
			return null;
		Object[] row = (Object[]) mRows.get(aRow);
		if (row.length < aColumn)
			return null;
		return row[aColumn];
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#getColumnClass(int)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public Class getColumnClass(int aColumn)
	{
		return String.class;
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:02:53 PM</strong>
	 * <BR>Purpose <i></i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aValue
	 * @param aRow
	 * @param aColumn
	 */
	public void setValueAt(String aValue, int aRow, int aColumn)
	{
		if (mRows == null)
			return;
		if (mRows.size() < aRow)
		{
			Object[] row = new Object[getColumnCount()];
			row[aColumn] = aValue;
			mRows.add(row);
		}
		else
		{
			Object[] row = (Object[]) mRows.get(aRow);
			row[aColumn] = aValue;
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 * <br>Purpose to override <i></i>
	 *
	 */
	public int getRowCount()
	{
		return mRows.size();
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 * <br>Purpose to override <i></i>
	 *
	 */
	public int getColumnCount()
	{
		return mColumnNames.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public String getColumnName(int aColumn)
	{
		return mColumnNames[aColumn];
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#isCellEditable(int, int)
	 * <br>Purpose to override <i></i>
	 *
	 */
	public boolean isCellEditable(int row, int column)
	{
		return false;
	}
}