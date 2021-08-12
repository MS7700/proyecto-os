using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ImagesApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                string[] param = Environment.GetCommandLineArgs();

                TxtFactura.Text = param[1];
                TxtCondicion.Text = param[2];
                TxtCliente.Text = param[3];
                TxtFecha.Text = param[4];
                TxtMonto.Text = param[5];
                TxtEstado.Text = param[6];

                Image ImageFile = Image.FromFile($"c:\\{TxtFactura.Text}.jpeg");

                ImgFactura.Image = ImageFile;
            }
            catch {
                MessageBox.Show($"¡ERROR CONSULTANDO LA FACTURA {TxtFactura.Text}!");
                Close();
            }
        }

        private void button1_Click(object sender, EventArgs e) 
        {
            Close();
        }
    }
}
