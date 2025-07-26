using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using AtividadeMVC_.Models;

namespace AtividadeMVC_.Models
{
    public class AtividadeMVC_Context : DbContext
    {
        public AtividadeMVC_Context (DbContextOptions<AtividadeMVC_Context> options)
            : base(options)
        {
        }

        public DbSet<AtividadeMVC_.Models.Aluno> Aluno { get; set; }

        public DbSet<AtividadeMVC_.Models.Professor> Professor { get; set; }
    }
}
