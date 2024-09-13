using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Publicaciones_v04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Publicacion[] publicaciones = new Publicacion[3];
            publicaciones[0] = new Articulo("A relational model of data for large shared data banks", new Autor("Codd", "Edgard Frank"), 1970, "Communications of ACM", 13, 6, "junio");
            Autor[] autores = {new Autor("Gamma", "Erich"), new Autor("Helm", "Richard"), new Autor("Johnson", "Ralph"), new Autor("Vlissides", "John") };
            publicaciones[1] = new Libro("Design Patterns: Elements of Reusable Object-Oriented Software", autores, 4, 1993, "1era edición", "Massachusetts", "Addison-Wesley Professional");
            publicaciones[2] = new Tesis("A systema of logic based on ordinals", new Autor("Turing", "Alan Mathison"), 1938, Clase_de_Tesis.LICENCIATURA, "Departamento de Matemáticas", "Universidad de Princeton", "Princeton", "NJ");

            for (int i = 0; i < 3; i++)
            {
                publicaciones[i].referenciar();
                Publicacion.orden_presentacion++;
            }
        }
    }
}
