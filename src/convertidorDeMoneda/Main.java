package convertidorDeMoneda;

import javax.swing.JOptionPane;

public class Main 
{
		
	public static void main(String[] args) 
	{
		
		ConverterOption();
					
	}
	
	private static void ConverterOption()
	{
		
		String[] converterOptions = {"Convertidor de Monedas", "Convertidor de Temperatura"};
		
		Object converterChoice = JOptionPane.showInputDialog(null, "Seleccione una opcíon de conversión:", "Convertidor", JOptionPane.QUESTION_MESSAGE, null, converterOptions, 0);
		
		if(converterChoice == converterOptions[0])
		{
			CurrencyConverter();
		}
		else
		{
			TemperatureConverter();
		}
		
	}
	
	private static void CurrencyConverter()
	{
		String[] currencyMenu = {"Peso Mexicano a Dólar Americano", "Dólar Americano a Peso Mexicano", "Peso Mexicano a Euro", "Euro a Peso Mexicano", "Peso Mexicano a Libra Esterlina", "Libra Esterlina a Peso Mexicano", "Peso Mexicano a Yen Japonés", "Yen Japonés a Peso Mexicano", "Peso Mexicano a Won sul-coreano",	"Won sul-coreano a Peso Mexicano"};
		
		Object currencyTarget = JOptionPane.showInputDialog(null, "Seleccione la moneda que desea convertir", "Convertidor de moneda", JOptionPane.QUESTION_MESSAGE, null, currencyMenu ,0);
		
		double conversionRate = 0.0;
		
		switch(currencyTarget.toString())
		{
			case "Peso Mexicano a Dólar Americano":
	            conversionRate = 0.05;
	            break;
	        case "Dólar Americano a Peso Mexicano":
	            conversionRate = 18.55;
	            break;
	        case "Peso Mexicano a Euro":
	            conversionRate = 0.04;
	            break;
	        case "Euro a Peso Mexicano":
	            conversionRate = 20.22;
	            break;
	        case "Peso Mexicano a Libra Esterlina":
	            conversionRate = 0.04;
	            break;
	        case "Libra Esterlina a Peso Mexicano":
	            conversionRate = 22.85;
	            break;
	        case "Peso Mexicano a Yen Japonés":
	            conversionRate = 7.04;
	            break;
	        case "Yen Japonés a Peso Mexicano":
	            conversionRate = 0.14;
	            break;
	        case "Peso Mexicano a Won sul-coreano":
	            conversionRate = 68.99;
	            break;
	        case "Won sul-coreano a Peso Mexicano":
	            conversionRate = .01;
	            break;
	        default:
	            JOptionPane.showMessageDialog(null, "La opción seleccionada no es válida.");
	            return;
		
		}
		
		while (true) 
		{
	        try 
	        {
	            String currencyInputString = JOptionPane.showInputDialog(null, "Seleccione la cantidad a convertir", "Convertidor de moneda", JOptionPane.QUESTION_MESSAGE);
	            double currencyInput = Double.parseDouble(currencyInputString);
	            double convertedValue = currencyInput * conversionRate;
	            JOptionPane.showMessageDialog(null, "El valor convertido es: " + convertedValue);
	            break;
	        } catch (NumberFormatException e) 
	        {
	            JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numérico válido.");
	        }
		}
	    
		Object nextStep = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		System.out.println(nextStep);
		switch(nextStep.toString())
		{
		case "0":
			ConverterOption();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			break;
		}
	}
	
	private static void TemperatureConverter()
	{
		String[] temperatureOptions = {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin", "Grados Fahrenheit a Grados Celsius", "Grados Fahrenheit a Kelvin", "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit"};
		
		Object temperatureTarget = JOptionPane.showInputDialog(null, "Seleccione la unidad de temperatura que desea convertir", "Convertidor de temperatura", JOptionPane.QUESTION_MESSAGE, null, temperatureOptions ,0);
		
		double result = 0.0;
		
		switch(temperatureTarget.toString())
		{
			case "Grados Celsius a Grados Fahrenheit":
	            result = 1.8;
	            break;
	        case "Grados Celsius a Kelvin":
	        	result = 1.0;
	            break;
	        case "Grados Fahrenheit a Grados Celsius":
	        	result = 0.55555555556;
	            break;
	        case "Grados Fahrenheit a Kelvin":
	        	result = 0.55555555556;
	            break;
	        case "Kelvin a Grados Celsius":
	        	result = 1.0;
	            break;
	        case "Kelvin a Grados Fahrenheit":
	        	result = 1.8;
	            break;
		}
		
		while (true) 
		{
	        try 
	        {
	            String temperatureInputString = JOptionPane.showInputDialog(null, "Seleccione la cantidad a convertir", "Convertidor de moneda", JOptionPane.QUESTION_MESSAGE);
	            double temperatureInput = Double.parseDouble(temperatureInputString);double convertedValue = 0.0;
	            
	            if (temperatureTarget.toString().equals("Grados Celsius a Grados Fahrenheit")) 
	            {
	                convertedValue = (temperatureInput * result) + 32;
	            } 
	            else if (temperatureTarget.toString().equals("Grados Celsius a Kelvin")) 
	            {
	                convertedValue = temperatureInput + 273.15;
	            } 
	            else if (temperatureTarget.toString().equals("Grados Fahrenheit a Grados Celsius")) 
	            {
	                convertedValue = (temperatureInput - 32) * result;
	            } 
	            else if (temperatureTarget.toString().equals("Grados Fahrenheit a Kelvin")) 
	            {
	                convertedValue = (temperatureInput - 32) * result + 273.15;
	            } 
	            else if (temperatureTarget.toString().equals("Kelvin a Grados Celsius")) 
	            {
	                convertedValue = temperatureInput - 273.15;
	            } 
	            else if (temperatureTarget.toString().equals("Kelvin a Grados Fahrenheit")) 
	            {
	                convertedValue = (temperatureInput * result) - 459.67;
	            }
	            
	            JOptionPane.showMessageDialog(null, "El valor convertido es: " + convertedValue);
	            break;
	        } catch (NumberFormatException e) 
	        {
	            JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numérico válido.");
	        }
		}
	    
		Object nextStep = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		System.out.println(nextStep);
		switch(nextStep.toString())
		{
		case "0":
			ConverterOption();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			break;
		}
	}
}

