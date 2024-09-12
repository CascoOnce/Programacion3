using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v04
{
    internal class Tesis : Publicacion
    {
        // Atributos
        private Clase_de_Tesis clase;
        private string departamento;
        private string institucion;
        private string ciudad;
        private string estado;
        // Metodos
        // Constructor
        public Tesis(string nombre, string[] autores, int cantidad_autores, int año,
            Clase_de_Tesis clase, string departamento, string institucion, string ciudad, 
            string estado) :
            base(nombre, autores, cantidad_autores, año)
        {
            this.clase = clase;
            this.departamento = departamento;
            this.institucion = institucion;
            this.ciudad = ciudad;
            this.estado = estado;
        }
        public Tesis(string nombre, string autor, int año, Clase_de_Tesis clase,
                string departamento, string institucion, string ciudad, string estado) :
            base(nombre, autor, año)
        {
            this.clase = clase;
            this.departamento = departamento;
            this.institucion = institucion;
            this.ciudad = ciudad;
            this.estado = estado;
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
            referencia += ", " + this.nombre + ", " + this.clase + ", " +
                this.departamento + ", " + this.institucion + ", " + this.ciudad +
                ", " + this.estado + ", " + this.año.ToString() + ".";
            Console.WriteLine(referencia);
        }
    }
}
