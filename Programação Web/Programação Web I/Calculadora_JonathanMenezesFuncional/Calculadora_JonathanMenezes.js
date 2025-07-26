function insert(num)
{
    var numero = document.getElementById('display').innerHTML;
    document.getElementById('display').innerHTML = numero + num;
}
function igual()
{
    var display = document.getElementById('display').innerHTML;
    if(display)
    {
        document.getElementById('display').innerHTML = eval(display);
    }
    else
    {
        document.getElementById('display').innerHTML = "Nada..."
    }
}
function apagar()
{
    document.getElementById('display').innerHTML = "";
}
function back()
{
    var display = document.getElementById('display').innerHTML;
    document.getElementById('display').innerHTML = display.substring(0, display.length -1);
}
