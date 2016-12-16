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

package org.eshark.szj.gui;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import org.eshark.szj.gui.model.ListComboBoxModel;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;
import org.eshark.szj.Constants;
import org.eshark.szj.gui.model.BasicTableModel;

/**
 * <TABLE BORDER="1" WIDTH="100%">
 * <TR>
 * <TH>Particulars</TH><TH>::</TH><TH>Details</TH>
 * </TR>
 * <TR>
 * <TD>Project Name</TD><TD>::</TD><TD>SearchZipsAndJars</TD>
 * </TR>
 * <TR>
 * <TD>File Name</TD><TD>::</TD><TD>MainWindow.java</TD>
 * </TR>
 * <TR>
 * <TD>Created on</TD><TD>::</TD><TD>Jan 1, 2009 11:42:56 PM</TD>
 * </TR>
 * <TR>
 * <TD>@author</TD><TD>::</TD><TD><a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a></TD>
 * </TR>
 * <TR>
 * <TD>Purpose</TD><TD>::</TD><TD>The main window/ single userinterface of the application.
 * This defines the user interface and also the action can be performaed through the application.</TD>
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
 * <TR>
 * <TD>Dec 3, 2008</TD><TD>Corrected the coding to make it availbe for jdk 1.4</TD>
 * </TR>
 * </TABLE>
 */
public class MainWindow extends javax.swing.JFrame
{
	private static final long	serialVersionUID	= -5015412932705400036L;

	/**
	 * This creates MainWindow
	 */
	public MainWindow()
	{
		initComponents();
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:07:09 PM</strong>
	 * <BR>Purpose <i>This method is called from within the constructor to
	 * initialize the form.</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 */
	private void initComponents()
	{

		jtabContainer = new javax.swing.JTabbedPane();
		jpnlExpressionTab = new javax.swing.JPanel();
		jpnlExpression = new javax.swing.JPanel();
		jbtnFilesFolders = new javax.swing.JButton();
		jbtnRemove = new javax.swing.JButton();
		jcbxExpressionType = new javax.swing.JComboBox();
		jtxtExpression = new javax.swing.JTextField();
		jtbnSearch = new javax.swing.JButton();
		jpnlFilesList = new javax.swing.JPanel();
		jscpList = new javax.swing.JScrollPane();
		jlstFiles = new javax.swing.JList();
		jpnlResultTab = new javax.swing.JPanel();
		jpnlExpressionText = new javax.swing.JPanel();
		jlblExpression = new javax.swing.JLabel();
		jpnlResult = new javax.swing.JPanel();
		jscpResults = new javax.swing.JScrollPane();
		jtblResult = new javax.swing.JTable();
		jpnlStatus = new javax.swing.JPanel();
		jpgbSearch = new javax.swing.JProgressBar();
		jlblRunning = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Search Zips & Jars");

		jpnlExpressionTab.setToolTipText("Search Expression");
		jpnlExpressionTab.setLayout(new java.awt.BorderLayout());

		jpnlExpression.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Expression",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
		jpnlExpression.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

		jbtnFilesFolders.setMnemonic('A');
		jbtnFilesFolders.setText("Add files & folders to search    ");
		jbtnFilesFolders.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jbtnFilesFoldersActionPerformed(evt);
			}
		});
		jpnlExpression.add(jbtnFilesFolders);

		jbtnRemove.setMnemonic('R');
		jbtnRemove.setText("Remove");
		jbtnRemove.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jbtnRemoveActionPerformed(evt);
			}
		});
		jpnlExpression.add(jbtnRemove);

		jcbxExpressionType.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		{ "Contains", "Equals", "Starts with", "Ends with" }));
		jpnlExpression.add(jcbxExpressionType);

		jtxtExpression.setColumns(30);
		jtxtExpression.setMinimumSize(new java.awt.Dimension(160, 20));
		jtxtExpression.setPreferredSize(new java.awt.Dimension(160, 20));
		jpnlExpression.add(jtxtExpression);

		jtbnSearch.setMnemonic('S');
		jtbnSearch.setText("Search");
		jtbnSearch.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jtbnSearchActionPerformed(evt);
			}
		});
		jpnlExpression.add(jtbnSearch);

		jpnlExpressionTab.add(jpnlExpression, java.awt.BorderLayout.NORTH);

		jpnlFilesList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Files to search",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
		jpnlFilesList.setLayout(new java.awt.BorderLayout());

		jlstFiles.setModel(new ListComboBoxModel(new ArrayList()));
		jscpList.setViewportView(jlstFiles);

		jpnlFilesList.add(jscpList, java.awt.BorderLayout.CENTER);

		jpnlExpressionTab.add(jpnlFilesList, java.awt.BorderLayout.CENTER);

		jtabContainer.addTab("Expression", null, jpnlExpressionTab, "Search Expression");

		jpnlResultTab.setToolTipText("Search Result");
		jpnlResultTab.setName("Result"); // NOI18N
		jpnlResultTab.setLayout(new java.awt.BorderLayout());

		jpnlExpressionText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expression",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
		jpnlExpressionText.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

		jlblExpression.setText("File name ");
		jpnlExpressionText.add(jlblExpression);

		jpnlResultTab.add(jpnlExpressionText, java.awt.BorderLayout.NORTH);

		jpnlResult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
		jpnlResult.setLayout(new java.awt.BorderLayout());

		jtblResult.setModel(new BasicTableModel(new String[]
		{ "Zip/Jar name", "Entry Name" }, new ArrayList()));
		jtblResult.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		jscpResults.setViewportView(jtblResult);

		jpnlResult.add(jscpResults, java.awt.BorderLayout.CENTER);

		jpnlResultTab.add(jpnlResult, java.awt.BorderLayout.CENTER);

		jtabContainer.addTab("Result", null, jpnlResultTab, "Search Result");

		getContentPane().add(jtabContainer, java.awt.BorderLayout.CENTER);

		jpnlStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jpnlStatus.setLayout(new java.awt.BorderLayout());

		jpgbSearch.setForeground(new java.awt.Color(0, 153, 0));
		jpgbSearch.setString("");
		jpgbSearch.setStringPainted(true);
		jpnlStatus.add(jpgbSearch, java.awt.BorderLayout.CENTER);

		jlblRunning.setText("  Idle  ");
		jpnlStatus.add(jlblRunning, java.awt.BorderLayout.EAST);

		getContentPane().add(jpnlStatus, java.awt.BorderLayout.SOUTH);

		pack();
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:10:36 PM</strong>
	 * <BR>Purpose <i>action handling code for the FilesFoldersAction button</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param evt
	 */
	private void jbtnFilesFoldersActionPerformed(java.awt.event.ActionEvent evt)
	{
		File lFileToSearch = null;

		JFileChooser lFileChooser = new JFileChooser(new File("."));
		//lFileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		lFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int ret = lFileChooser.showOpenDialog(this);

		if (ret != JFileChooser.APPROVE_OPTION)
		{
			return;
		}
		lFileToSearch = lFileChooser.getSelectedFile();

		if (lFileToSearch.isDirectory())
		{
			handleDirectory(lFileToSearch);
		}

		addItemToFileList(lFileToSearch.getAbsolutePath());

	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:09:13 PM</strong>
	 * <BR>Purpose <i>action handling code for the Remove button</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param evt
	 */
	private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt)
	{

		ListComboBoxModel lModel = (ListComboBoxModel) jlstFiles.getModel();
		if (lModel.getSize() <= 0)
			return;

		Object[] lSelectedValues = jlstFiles.getSelectedValues();
		for (int indx = 0; indx < lSelectedValues.length; indx++)
		{
			lModel.remove(lSelectedValues[indx].toString());
		}
		jlstFiles.updateUI();
		if (lModel.getSize() > 0)
			jlstFiles.setSelectedIndex(lModel.getSize() - 1);
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:09:25 PM</strong>
	 * <BR>Purpose <i>action handling code for the Search button</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param evt
	 */
	private void jtbnSearchActionPerformed(java.awt.event.ActionEvent evt)
	{
		String lstrExpression = jtxtExpression.getText();
		if (lstrExpression == null || lstrExpression.trim().length() <= 0)
			return;
		jlblRunning.setText("  Searching...  ");
		jtabContainer.setSelectedComponent(jpnlResultTab);
		jlblExpression.setText("File name " + (jcbxExpressionType.getSelectedItem() + " ").toLowerCase() + "\""
				+ lstrExpression + "\"");
		((BasicTableModel) jtblResult.getModel()).clear();
		ListComboBoxModel lModel = (ListComboBoxModel) jlstFiles.getModel();
		int lmaxSize = lModel.getSize();
		jpgbSearch.setMinimum(0);
		jpgbSearch.setValue(0);
		jpgbSearch.setMaximum(lmaxSize - 1);
		for (int indx = 0; indx < lmaxSize; indx++)
		{
			searchForExpression(lModel.getElementAt(indx) + "", lstrExpression.toLowerCase(), jcbxExpressionType
					.getSelectedItem()
					+ "");
			jpgbSearch.setValue(indx);
		}
		jtblResult.tableChanged(null);
		jlblRunning.setText("  Idle  ");
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:09:40 PM</strong>
	 * <BR>Purpose <i>This method evaluates the expression with the entry of the Zip
	 *  or Jar and if match found, it adds the result to the result table.</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aFilePathToSearch aFilepath for a zip or jar file
	 * @param aExpression the expression text to search
	 * @param aExpressionType the expression type like 
	 * contains/equals/starts with/ends with.
	 */
	public void searchForExpression(String aFilePathToSearch, String aExpression, String aExpressionType)
	{

		File lFileToSearch = new File(aFilePathToSearch);
		if (!lFileToSearch.exists())
		{
			return;
		}

		ZipFile lZipFile = null;
		ZipEntry lTempEntry = null;
		String lEntryNameWithoutPath = "";
		BasicTableModel lModel = (BasicTableModel) jtblResult.getModel();

		try
		{
			lZipFile = new ZipFile(lFileToSearch);
			Enumeration lAllEntries = lZipFile.entries();

			if (Constants.EXPR_CONTAINS.equals(aExpressionType))
			{
				while (lAllEntries.hasMoreElements())
				{
					lTempEntry = (ZipEntry) lAllEntries.nextElement();
					lEntryNameWithoutPath = lTempEntry.getName().toLowerCase();
					if (lEntryNameWithoutPath.lastIndexOf("/") != -1)
						lEntryNameWithoutPath = lEntryNameWithoutPath
								.substring(lEntryNameWithoutPath.lastIndexOf("/") + 1);
					if (lEntryNameWithoutPath.indexOf(aExpression) != -1)
						lModel.addRow(new String[]
						{ aFilePathToSearch, lTempEntry.getName() });
				}
			}
			else if (Constants.EXPR_EQUALS.equals(aExpressionType))
			{
				while (lAllEntries.hasMoreElements())
				{
					lTempEntry = (ZipEntry) lAllEntries.nextElement();
					lEntryNameWithoutPath = lTempEntry.getName().toLowerCase();
					if (lEntryNameWithoutPath.lastIndexOf("/") != -1)
						lEntryNameWithoutPath = lEntryNameWithoutPath
								.substring(lEntryNameWithoutPath.lastIndexOf("/") + 1);
					if (lEntryNameWithoutPath.equals(aExpression))
						lModel.addRow(new String[]
						{ aFilePathToSearch, lTempEntry.getName() });
				}
			}
			else if (Constants.EXPR_STARTS_WITH.equals(aExpressionType))
			{
				while (lAllEntries.hasMoreElements())
				{
					lTempEntry = (ZipEntry) lAllEntries.nextElement();
					lEntryNameWithoutPath = lTempEntry.getName().toLowerCase();
					if (lEntryNameWithoutPath.lastIndexOf("/") != -1)
						lEntryNameWithoutPath = lEntryNameWithoutPath
								.substring(lEntryNameWithoutPath.lastIndexOf("/") + 1);
					if (lEntryNameWithoutPath.startsWith(aExpression))
						lModel.addRow(new String[]
						{ aFilePathToSearch, lTempEntry.getName() });
				}
			}
			else if (Constants.EXPR_ENDS_WITH.equals(aExpressionType))
			{
				while (lAllEntries.hasMoreElements())
				{
					lTempEntry = (ZipEntry) lAllEntries.nextElement();
					lEntryNameWithoutPath = lTempEntry.getName().toLowerCase();
					if (lEntryNameWithoutPath.lastIndexOf("/") != -1)
						lEntryNameWithoutPath = lEntryNameWithoutPath
								.substring(lEntryNameWithoutPath.lastIndexOf("/") + 1);
					if (lEntryNameWithoutPath.endsWith(aExpression))
						lModel.addRow(new String[]
						{ aFilePathToSearch, lTempEntry.getName() });
				}
			}
		}
		catch (ZipException ZE)
		{
			JOptionPane.showInternalMessageDialog(this, ZE.getMessage(), "Applicaion Error", JOptionPane.ERROR_MESSAGE);
		}
		catch (IOException IOE)
		{
			JOptionPane
					.showInternalMessageDialog(this, IOE.getMessage(), "Applicaion Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:09:59 PM</strong>
	 * <BR>Purpose <i>This method recursively iterates and adds all zips and jars present
	 * under the directories and it sub-directories.</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aDirectory Directory to search for.
	 */
	public void handleDirectory(File aDirectory)
	{
		File children[] = aDirectory.listFiles();
		if (children != null)
		{
			for (int indx = 0; indx < children.length; indx++)
				if (children[indx].isDirectory())
					handleDirectory(children[indx]);
				else
					addItemToFileList(children[indx].getAbsolutePath());
		}
	}

	/**
	 * <BR>Introduced <strong>Dec 3, 2008 12:10:05 PM</strong>
	 * <BR>Purpose <i>Adds one Zip or jar file absolute name to the file list.</i>
	 * @author <a href="mailto:subhasish@gmail.com">Subhasish Chattopadhyay</a>
	 * @param aFileName The name to add to the file to search list
	 */
	public void addItemToFileList(String aFileName)
	{
		if (!(aFileName.endsWith(Constants.FILE_JAR) || aFileName.endsWith(Constants.FILE_ZIP)))
			return;

		ListComboBoxModel lModel = (ListComboBoxModel) jlstFiles.getModel();
		lModel.addItem(aFileName);
		jlstFiles.updateUI();
		if (lModel.getSize() > 0)
			jlstFiles.setSelectedIndex(lModel.getSize() - 1);
	}

	//VARIABLES
	private javax.swing.JButton			jbtnFilesFolders;
	private javax.swing.JButton			jbtnRemove;
	private javax.swing.JComboBox		jcbxExpressionType;
	private javax.swing.JLabel			jlblExpression;
	private javax.swing.JLabel			jlblRunning;
	private javax.swing.JList			jlstFiles;
	private javax.swing.JProgressBar	jpgbSearch;
	private javax.swing.JPanel			jpnlExpression;
	private javax.swing.JPanel			jpnlExpressionTab;
	private javax.swing.JPanel			jpnlExpressionText;
	private javax.swing.JPanel			jpnlFilesList;
	private javax.swing.JPanel			jpnlResult;
	private javax.swing.JPanel			jpnlResultTab;
	private javax.swing.JPanel			jpnlStatus;
	private javax.swing.JScrollPane		jscpList;
	private javax.swing.JScrollPane		jscpResults;
	private javax.swing.JTabbedPane		jtabContainer;
	private javax.swing.JTable			jtblResult;
	private javax.swing.JButton			jtbnSearch;
	private javax.swing.JTextField		jtxtExpression;
}
