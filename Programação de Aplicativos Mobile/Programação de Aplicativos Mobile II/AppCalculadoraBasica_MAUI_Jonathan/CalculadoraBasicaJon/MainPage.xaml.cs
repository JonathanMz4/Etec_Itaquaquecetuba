namespace CalculadoraBasicaJon
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }


        private void Soma(object sender, EventArgs e)
        {
            try
            {
                double num1 = Convert.ToDouble(txt_num1.Text);
                double num2 = Convert.ToDouble(txt_num2.Text);
                double soma;
                soma = num1+num2;
                resultado.Text = "Resultado: " + soma.ToString();
            }
            catch (Exception ex){
                resultado.Text = "Algo deu errado, tente novamente";
            }
        }

        private void Sub(object sender, EventArgs e)
        {
            try
            {
                double num1 = Convert.ToDouble(txt_num1.Text);
                double num2 = Convert.ToDouble(txt_num2.Text);
                double sub;
                sub = num1 - num2;
                resultado.Text = "Resultado: " + sub.ToString();
            }
            catch (Exception ex)
            {
                resultado.Text = "Algo deu errado, tente novamente";
            }
        }

        private void Multi(object sender, EventArgs e)
        {
            try
            {
                double num1 = Convert.ToDouble(txt_num1.Text);
                double num2 = Convert.ToDouble(txt_num2.Text);
                double multi;
                multi = num1 * num2;
                resultado.Text = "Resultado: " + multi.ToString();
            }
            catch (Exception ex)
            {
                resultado.Text = "Algo deu errado, tente novamente";
            }
        }

        private void Div(object sender, EventArgs e)
        {
            try
            {
                double num1 = Convert.ToDouble(txt_num1.Text);
                double num2 = Convert.ToDouble(txt_num2.Text);
                double div;
                div = num1 / num2;
                resultado.Text = "Resultado: "+div.ToString();
            }
            catch (Exception ex)
            {
                resultado.Text = "Algo deu errado, tente novamente";
            }
        }
    }
}
