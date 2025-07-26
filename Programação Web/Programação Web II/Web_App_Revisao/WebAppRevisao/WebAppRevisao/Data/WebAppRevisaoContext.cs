using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace WebAppRevisao.Models
{
    public class WebAppRevisaoContext : DbContext
    {
        public WebAppRevisaoContext (DbContextOptions<WebAppRevisaoContext> options)
            : base(options)
        {
        }

        public DbSet<WebAppRevisao.Models.Produto> Produto { get; set; }
    }
}
