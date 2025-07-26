using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AtividadeCrudeWebBD.Models
{
    public class Produto : Base
    {
        public string Nome { get; set; }
        public DateTime DatadeCadastro { get; set; }
        public string Descricao { get; set; }
    }
}
