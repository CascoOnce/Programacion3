using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v04
{
    internal class Autor
    {
        // Atributos
        private String apellidos;
        private String nombres;
        // Metodos
        // Constructor
        public Autor(String apellidos, String nombres)
        {
            this.apellidos = apellidos;
            this.nombres = nombres;
        }
        // Impresion
        public String lineaAutor()
        {
            return nombres + " " + apellidos;
        }
    }
}
