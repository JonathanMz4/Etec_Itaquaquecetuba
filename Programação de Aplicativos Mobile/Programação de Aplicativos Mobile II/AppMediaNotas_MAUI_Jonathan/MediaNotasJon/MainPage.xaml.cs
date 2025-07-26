namespace MediaNotasJon
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private void MediaNotas(object sender, EventArgs e)
        {
            try
            {
                double nota1 = Convert.ToDouble(txt_nota1.Text);
                double nota2 = Convert.ToDouble(txt_nota2.Text);
                double media = (nota1 + nota2) / 2;
                string situacao = media >= 7 ? "Aprovado" : "Reprovado";
                resultado.Text = "Resultado: "+media.ToString();
                txtsituacao.Text = "Situacão: "+situacao;  

            }
            catch (Exception ex)
            {
                resultado.Text = "Algo deu errado, tente novamente";
            }
        }

    }
}


