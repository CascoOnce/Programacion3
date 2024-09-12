using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v02
{
    internal class Tesis: Publicacion
    {
    // Atributos
        private string clase;
        private string departamento;
        private string institucion;
        private string ciudad;
        private string estado;
    // Metodos
        // Constructor
        public Tesis(string nombre, string[] autores, int cantidad_autores, int año,
            string clase, string departamento, string institucion, string ciudad, string estado):
            base(nombre, autores, cantidad_autores, año)
        {
            this.clase = clase;
            this.departamento = departamento;
            this.institucion = institucion;
            this.ciudad = ciudad;
            this.estado = estado;
        }
        public Tesis(string nombre, string autor, int año, string clase,
                string departamento, string institucion, string ciudad, string estado):
            base(nombre, autor, año)
        {
            this.clase = clase;
            this.departamento = departamento;
            this.institucion = institucion;
            this.ciudad = ciudad;
            this.estado = estado;
        }
    }
}
