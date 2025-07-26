namespace ComparaCombustivel
{
    public partial class MainPage : ContentPage
    {

        public MainPage()
        {
            InitializeComponent();
        }

        private void ButtonClicked(object sender, EventArgs e)
        {
            try
            {
                double etanol = Convert.ToDouble(txt_etanol.Text);
                double gasolina = Convert.ToDouble(txt_gasolina.Text);
                String msg = " ";
                if (etanol  <= (gasolina * 0.7))
                {
                    msg = "Etanol compensa mais";
                }
                else {
                    msg = "Gasolina compensa mais";
                }
                DisplayAlert("Calculado", msg, "OK");
            }
            catch (Exception ex) {
                DisplayAlert("Erro no programa", ex.Message, "OK");
            }
        }
    }

}
