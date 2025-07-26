using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using AtividadeCrudeWebBD.Models;

namespace AtividadeCrudeWebBD.Models
{
    public class AtividadeCrudeWebBDContext : DbContext
    {
        public AtividadeCrudeWebBDContext (DbContextOptions<AtividadeCrudeWebBDContext> options)
            : base(options)
        {
        }

        public DbSet<AtividadeCrudeWebBD.Models.Produto> Produto { get; set; }

        public DbSet<AtividadeCrudeWebBD.Models.Cliente> Cliente { get; set; }
    }
}
