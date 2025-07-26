using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebAppRevisao.Models
{
    /// <summary>
    /// Dados da classe produto
    /// </summary>
    public class Produto
    {
        #region Propriedade da classe produtos
        public int Id { get; set; }
        public string NomeProduto{ get; set; }
        public string DescricaoProduto { get; set; }
        public DateTime DataDeCompraProduto { get; set; }
        public bool ProdutoAtivo { get; set; }
        #endregion
    }
}
