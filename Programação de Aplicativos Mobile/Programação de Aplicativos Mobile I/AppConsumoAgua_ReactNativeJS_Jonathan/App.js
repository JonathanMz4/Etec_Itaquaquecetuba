import React, {useState, } from "react";
import { View, Text, TextInput, Button, StyleSheet } from "react-native";

export default function App() {

  const [agua, setAgua] = useState(0);
  const [meta] = useState(2000);
  const [valor, setValor] = useState("");
  const [mensagem, setMensagem] = useState("");

  const adicionar = () =>{
    const resultado=parseInt(valor);
    
    if (!isNaN(resultado)) {
      const totalAgua = agua + resultado;
      setAgua(totalAgua);
      setValor("");

      if (totalAgua >= meta) {
        setMensagem("Parabéns, você conseguiu a meta diária de água!");
      } else {
        setMensagem("");
      }
    } 
    else {
      setMensagem("INSIRA UM VALOR VÁLIDO");
    }
  }

  const limpar = () =>{
    setValor("");
    setAgua(0);
    setMensagem("");
  }

  return (
    <View style={styles.app}>
      <View>
        <Text style={styles.legenda}>Registro de Consumo de Agua</Text>
        <Text> </Text>
      </View>
      <View>
        <TextInput style={styles.campo}
          placeholder = 'Digite a quantidade de Agua (ML)'
          keyboardType = 'numeric'
          value={valor}
          onChangeText={setValor}
        />
        <Text> </Text>
        <Button color="green" title="Adicionar" onPress={adicionar} />
        <Text> </Text>
        <Button color="red" title="Limpar" onPress={limpar} />
        <Text> </Text>
        <Text style={styles.texto}>Agua Consumida: {agua}</Text>
        <Text> </Text>
        <Text style={styles.texto}>Meta Diaria: {meta}ml</Text>
        <Text> </Text>
        {mensagem !== "" && (
          <Text style={styles.aviso}>{mensagem}</Text>
        )}
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  app: {
    padding: 10,
  },

  aviso: {
    color: "blue", 
    fontWeight: "bold", 
    padding: 10, 
    textAlign: "center", 
    fontSize: 16,
  },

  legenda: {
    textAlign: "center",
    fontSize: 20,
    fontWeight: "bold",
  },

  texto: {
    textAlign: "center",
    fontSize: 16,
  },

  campo: {
    borderColor: "#000",
    borderWidth: 2,
    textAlign: "center",
    margin: 10,
    borderRadius: 5,
  },

});