package july24.activity.classes;

import july24.activity.interfaces.Currency;
import july24.activity.interfaces.Distance;
import july24.activity.interfaces.Temperature;

public class Converter implements Distance, Temperature, Currency {
	
	private double valueToConvert;
	
	Converter(double v) {
		this.setValueToConvert(v);
	}
	
	public double getValueToConvert() {
		return valueToConvert;
	}

	public void setValueToConvert(double valueToConvert) {
		this.valueToConvert = valueToConvert;
	}
	
	@Override
	public double feetsToInches() {
		return (this.getValueToConvert() * 12.0);
	}
	
	@Override
	public double inchesToFeets() {
		return (this.getValueToConvert() / 12.0);
	}

	@Override
	public double celsiusToFahrenheit() {
		return ((this.getValueToConvert() * 1.8) + 32.0);
	}

	@Override
	public double celsiusToKelvin() {
		return (this.getValueToConvert() + 273.15);
	}

	@Override
	public double fahrenheitToCelsius() {
		return ((this.getValueToConvert() - 32) * (5.0 / 9.0));
	}

	@Override
	public double fahrenheitToKelvin() {
		return ((this.getValueToConvert() - 32) * (5.0 / 9.0) + 273.15);
	}

	@Override
	public double kelvinToCelsius() {
		return (this.getValueToConvert() - 273.15);
	}

	@Override
	public double kelvinToFahrenheit() {
		return (((this.getValueToConvert() - 273.15) * 1.8) + 32.0);
	}

	@Override
	public double INRtoUSD() {
		return (this.getValueToConvert() / 83.71);
	}

	@Override
	public double USDtoINR() {
		return (this.getValueToConvert() * 83.71);
	}
	
}
