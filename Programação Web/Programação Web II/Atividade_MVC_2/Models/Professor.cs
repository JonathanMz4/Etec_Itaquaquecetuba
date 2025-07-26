using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AtividadeMVC_.Models
{
    public class Professor : Base
    {
        public string IdRM { get; set; }
        public string Nome { get; set; }
        public string Escola { get; set; }
        public Aluno Aluno { get; set; }
    }
}
