using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace WebAppBootstrap.Models
{
    public class WebAppBootstrapContext : DbContext
    {
        public WebAppBootstrapContext (DbContextOptions<WebAppBootstrapContext> options)
            : base(options)
        {
        }

        public DbSet<WebAppBootstrap.Models.Aluno> Aluno { get; set; }
    }
}
