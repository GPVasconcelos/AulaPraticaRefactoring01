public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer);

        for (Rental each : aCustomer.getRentals()) {
            result += rentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    protected abstract String headerString(Customer aCustomer);

    protected abstract String rentalString(Rental aRental);

    protected abstract String footerString(Customer aCustomer);
}
