
namespace ImagesApp
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.ImgFactura = new System.Windows.Forms.PictureBox();
            this.label1 = new System.Windows.Forms.Label();
            this.TxtFactura = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.TxtCondicion = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.TxtCliente = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.TxtFecha = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.TxtMonto = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.TxtEstado = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.ImgFactura)).BeginInit();
            this.SuspendLayout();
            // 
            // ImgFactura
            // 
            this.ImgFactura.Image = global::ImagesApp.Properties.Resources.Initial;
            this.ImgFactura.Location = new System.Drawing.Point(422, 148);
            this.ImgFactura.Name = "ImgFactura";
            this.ImgFactura.Size = new System.Drawing.Size(694, 636);
            this.ImgFactura.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.ImgFactura.TabIndex = 0;
            this.ImgFactura.TabStop = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.85714F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(627, 45);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(457, 42);
            this.label1.TabIndex = 1;
            this.label1.Text = "FACTURA DIGITALIZADA";
            // 
            // TxtFactura
            // 
            this.TxtFactura.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtFactura.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtFactura.Location = new System.Drawing.Point(55, 193);
            this.TxtFactura.Name = "TxtFactura";
            this.TxtFactura.ReadOnly = true;
            this.TxtFactura.Size = new System.Drawing.Size(330, 32);
            this.TxtFactura.TabIndex = 2;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(914, 824);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(202, 67);
            this.button1.TabIndex = 3;
            this.button1.Text = "CERRAR";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // TxtCondicion
            // 
            this.TxtCondicion.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtCondicion.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtCondicion.Location = new System.Drawing.Point(55, 297);
            this.TxtCondicion.Name = "TxtCondicion";
            this.TxtCondicion.ReadOnly = true;
            this.TxtCondicion.Size = new System.Drawing.Size(330, 32);
            this.TxtCondicion.TabIndex = 4;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(48, 148);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(287, 51);
            this.label2.TabIndex = 5;
            this.label2.Text = "ID FACTURA";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(47, 253);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(278, 51);
            this.label3.TabIndex = 6;
            this.label3.Text = "CONDICIÓN";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(49, 360);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(154, 29);
            this.label4.TabIndex = 8;
            this.label4.Text = "ID CLIENTE";
            // 
            // TxtCliente
            // 
            this.TxtCliente.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtCliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtCliente.Location = new System.Drawing.Point(57, 404);
            this.TxtCliente.Name = "TxtCliente";
            this.TxtCliente.ReadOnly = true;
            this.TxtCliente.Size = new System.Drawing.Size(328, 32);
            this.TxtCliente.TabIndex = 7;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(49, 468);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(266, 29);
            this.label5.TabIndex = 10;
            this.label5.Text = "FECHA DE FACTURA";
            // 
            // TxtFecha
            // 
            this.TxtFecha.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtFecha.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtFecha.Location = new System.Drawing.Point(57, 512);
            this.TxtFecha.Name = "TxtFecha";
            this.TxtFecha.ReadOnly = true;
            this.TxtFecha.Size = new System.Drawing.Size(328, 32);
            this.TxtFecha.TabIndex = 9;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(52, 575);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(110, 29);
            this.label6.TabIndex = 12;
            this.label6.Text = "MONTO";
            // 
            // TxtMonto
            // 
            this.TxtMonto.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtMonto.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtMonto.Location = new System.Drawing.Point(60, 619);
            this.TxtMonto.Name = "TxtMonto";
            this.TxtMonto.ReadOnly = true;
            this.TxtMonto.Size = new System.Drawing.Size(328, 32);
            this.TxtMonto.TabIndex = 11;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.857143F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(55, 684);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(118, 29);
            this.label7.TabIndex = 14;
            this.label7.Text = "ESTADO";
            // 
            // TxtEstado
            // 
            this.TxtEstado.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TxtEstado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtEstado.Location = new System.Drawing.Point(63, 728);
            this.TxtEstado.Name = "TxtEstado";
            this.TxtEstado.ReadOnly = true;
            this.TxtEstado.Size = new System.Drawing.Size(328, 32);
            this.TxtEstado.TabIndex = 13;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 24F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1165, 933);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.TxtEstado);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.TxtMonto);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.TxtFecha);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.TxtCliente);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.TxtCondicion);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.TxtFactura);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.ImgFactura);
            this.Name = "Form1";
            this.Text = "Factura Digitalizada";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.ImgFactura)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox ImgFactura;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox TxtFactura;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox TxtCondicion;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox TxtCliente;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox TxtFecha;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox TxtMonto;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox TxtEstado;
    }
}

