import React, {useState, } from "react";
import { View, Text, Button, StyleSheet, } from "react-native";

export default function App(){
const [count, setCount] = useState(0);

  return (
    <View style={styles.app}>
      <Text style={styles.text}>Contador: {count}</Text>
      <Button title="incrementar" onPress={() => setCount(count + 1)} />
      <Text>  </Text>
      <Button title="decrementar" onPress={() => setCount(count - 1)} />
    </View>
  );
}

const styles = StyleSheet.create({
  app:{
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    margin: 10,
  },
  text: {
    fontSize: 32,
    margin: 10,
  }
});
