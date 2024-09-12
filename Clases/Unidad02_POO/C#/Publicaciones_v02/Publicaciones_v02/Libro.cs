using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v02
{
    internal class Libro: Publicacion
    {
    // Atributos
        private string edicion;
        private string lugar;
        private string editorial;
    // Metodos
        // Constructor
        public Libro(String nombre, String[] autores, int cantidad_autores, int año,
            String edicion, String lugar, String editorial):
            base(nombre, autores, cantidad_autores, año)
        {
            this.edicion = edicion;
            this.lugar = lugar;
            this.editorial = editorial;
        }
        public Libro(String nombre, String autor, int año, String edicion, String lugar,
                String editorial):
             base(nombre, autor, año)
        {
            this.edicion = edicion;
            this.lugar = lugar;
            this.editorial = editorial;
        }
    }
}
