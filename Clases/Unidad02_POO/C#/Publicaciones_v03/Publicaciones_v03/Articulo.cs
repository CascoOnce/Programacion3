using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v03
{
    internal class Articulo : Publicacion
    {
        // Atributos
        private string revista;
        private int volumen;
        private int numero;
        private string mes;
        // Metodos
        // Constructor
        public Articulo(string nombre, string[] autores, int cantidad_autores, int año,
            string revista, int volumen, int numero, string mes) :
            base(nombre, autores, cantidad_autores, año)
        {
            this.revista = revista;
            this.volumen = volumen;
            this.numero = numero;
            this.mes = mes;
        }
        public Articulo(string nombre, string autor, int año,
            string revista, int volumen, int numero, string mes) :
            base(nombre, autor, año)
        {
            this.revista = revista;
            this.volumen = volumen;
            this.numero = numero;
            this.mes = mes;
        }
        // Impresion
        public override void referenciar()
        {
            string referencia = "[" + Publicacion.orden_presentacion + "] ";
            for (int i = 0; i < this.cantidad_autores; i++)
            {
                if (i != 0)
                {
                    if (i == this.cantidad_autores - 1) referencia += " and ";
                    else referencia += ", ";
                }
                referencia += this.autores[i];
            }
            referencia += ", \"" + this.nombre + "\", " + this.revista +
                ", vol. " + this.volumen.ToString() + ", no. " + this.numero.ToString() +
                ", " + this.mes + ", " + this.año.ToString() + ". ";
            Console.WriteLine(referencia);
        }
    }
}
