namespace _011_DesktopApp
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            DBUpdateButton = new Button();
            listViewClients = new ListView();
            columnHeaderID = new ColumnHeader();
            columnHeaderSurName = new ColumnHeader();
            columnHeaderFName = new ColumnHeader();
            columnHeaderBirthDate = new ColumnHeader();
            SuspendLayout();
            // 
            // DBUpdateButton
            // 
            DBUpdateButton.BackColor = SystemColors.HotTrack;
            DBUpdateButton.Font = new Font("Segoe UI", 12F);
            DBUpdateButton.Location = new Point(665, 623);
            DBUpdateButton.Name = "DBUpdateButton";
            DBUpdateButton.Size = new Size(132, 64);
            DBUpdateButton.TabIndex = 0;
            DBUpdateButton.Text = "Clients Update";
            DBUpdateButton.UseVisualStyleBackColor = false;
            DBUpdateButton.Click += DBUpdateButton_Click;
            // 
            // listViewClients
            // 
            listViewClients.Columns.AddRange(new ColumnHeader[] { columnHeaderID, columnHeaderSurName, columnHeaderFName, columnHeaderBirthDate });
            listViewClients.FullRowSelect = true;
            listViewClients.GridLines = true;
            listViewClients.Location = new Point(0, 0);
            listViewClients.MultiSelect = false;
            listViewClients.Name = "listViewClients";
            listViewClients.Size = new Size(797, 377);
            listViewClients.TabIndex = 1;
            listViewClients.UseCompatibleStateImageBehavior = false;
            listViewClients.View = View.Details;
            // 
            // columnHeaderID
            // 
            columnHeaderID.Text = "#";
            // 
            // columnHeaderSurName
            // 
            columnHeaderSurName.Text = "Second Name";
            columnHeaderSurName.Width = 200;
            // 
            // columnHeaderFName
            // 
            columnHeaderFName.Text = "Name";
            columnHeaderFName.Width = 200;
            // 
            // columnHeaderBirthDate
            // 
            columnHeaderBirthDate.Text = "Birth Day";
            columnHeaderBirthDate.Width = 100;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 699);
            Controls.Add(listViewClients);
            Controls.Add(DBUpdateButton);
            Name = "Form1";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "MyClinic";
            ResumeLayout(false);
        }

        #endregion

        private Button DBUpdateButton;
        private ListView listViewClients;
        private ColumnHeader columnHeaderID;
        private ColumnHeader columnHeaderSurName;
        private ColumnHeader columnHeaderFName;
        private ColumnHeader columnHeaderBirthDate;
    }
}
