using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v02
{
    internal abstract class Publicacion
    {
    // Atributos
        protected string nombre;
        protected string[] autores;
        protected int cantidad_autores;
        protected int año;
    // Metodos
        // Constructor
        public Publicacion(string nombre, string[] autores, int cantidad_autores, int año) {
            this.nombre = nombre;
            this.autores = autores;
            this.cantidad_autores = cantidad_autores;
            this.año = año;
        }
        public Publicacion(string nombre, string autor, int año) {
            this.nombre = nombre;
            this.autores = new string[1];
            this.autores[0] = autor;
            this.cantidad_autores = 1;
            this.año = año;
        }
        // Impresion
        public virtual void referenciar() {
            string referencia = "[1] ";
            for (int i = 0; i < this.cantidad_autores; i++){
                if (i != 0){
                    if (i == this.cantidad_autores - 1) referencia += " and ";
                    else referencia += ", ";
                }
                referencia += this.autores[i];
            }
            referencia += ". " + this.nombre + ". " + this.año.ToString() + ". ";
            Console.WriteLine(referencia);
        }
    }
}
