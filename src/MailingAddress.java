public class MailingAddress {

    String primaryStreet;
    String secondaryStreet;
    String city;
    String state;
    String postalCode;

    public MailingAddress(String primaryStreet, String secondaryStreet, String city, String state, String postalCode) {
        this.primaryStreet = primaryStreet;
        this.secondaryStreet = secondaryStreet;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void setPrimaryStreet(String primaryStreet) {
        this.primaryStreet = primaryStreet;
    }

    public void setSecondaryStreet(String secondaryStreet) {
        this.secondaryStreet = secondaryStreet;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return validateState(state);
    }

    public String getPrimaryStreet() {
        return primaryStreet;
    }

    public String getSecondaryStreet() {
        return secondaryStreet;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }


    private boolean validateAddress() {
        if (primaryStreet.length() == 0) {
            return false;
        }
        if (secondaryStreet.length() == 0) {
            return false;
        }
        if (city.length() == 0) {
            return false;
        }
        if (state.length() == 0) {
            return false;
        }
        if (postalCode.length() == 0) {
            return false;
        }
        return true;
    }

    public String validateState(String state) {
        if (state == null) {
            return null;
        }
        else {
            switch (state) {
                case "Alabama": case "AL": return "AL";
                case "Alaska": case "AK": return "AK";
                case "Arizona": case "AZ": return "AZ";
                case "Arkansas": case "AR": return "AR";
                case "California": case "CA": return "CA";
                case "Colorado": case "CO": return "CO";
                case "Connecticut": case "CT": return "CT";
                case "Delaware": case "DE": return "DE";
                case "Florida": case "FL": return "FE";
                case "Georgia": case "GA": return "GA";
                case "Hawaii": case "HI": return "HI";
                case "Idaho": case "ID": return "ID";
                case "Illinois": case "IL": return "IL";
                case "Indiana": case "IN": return "IN";
                case "Iowa": case "IA": return "IA";
                case "Kansas": case "KS": return "KS";
                case "Kentucky": case "KY": return "KY";
                case "Louisiana": case "LA": return "LA";
                case "Maine": case "ME": return "ME";
                case "Maryland": case "MD": return "MD";
                case "Massachusetts": case "MA": return "MA";
                case "Michigan": case "MI": return "MI";
                case "Minnesota": case "MN": return "MN";
                case "Mississippi": case "MS": return "MS";
                case "Missouri": case "MO": return "MO";
                case "Montana": case "MT": return "MT";
                case "Nebraska": case "NE": return "NE";
                case "Nevada": case "NV": return "NV";
                case "New Hampshire": case "NH": return "NH";
                case "New Jersey": case "NJ": return "NJ";
                case "New Mexico": case "NM": return "NM";
                case "New York": case "NY": return "NY";
                case "North Carolina": case "NC": return "NC";
                case "North Dakota": case "ND": return "ND";
                case "Ohio": case "OH": return "OH";
                case "Oklahoma": case "OK": return "OK";
                case "Oregon": case "OR": return "OR";
                case "Pennsylvania": case "PA": return "PA";
                case "Rhode Island": case "RI": return "RI";
                case "South Carolina": case "SC": return "SC";
                case "South Dakota": case "SD": return "SD";
                case "Tennessee": case "TN": return "TN";
                case "Texas": case "TX": return "TX";
                case "Utah": case "UT": return "UT";
                case "Vermont": case "VT": return "VT";
                case "Virginia": case "VA": return "VA";
                case "Washington": case "WA": return "WA";
                case "West Virginia": case "WV": return "WV";
                case "Wisconsin": case "WI": return "WI";
                case "Wyoming": case "WY": return "WY";
                default: return null;
            }
        }
    }

    public String getFormattedAddress() {
        String formattedAddress = "";
        if (getPrimaryStreet() == null && getSecondaryStreet() == null && getCity() == null && getState() == null && getPostalCode() == null) {
            return "N/A";
        }
        else {
            if (getPrimaryStreet() != null) formattedAddress += getPrimaryStreet();
            if (getSecondaryStreet() != null) formattedAddress += " " + getSecondaryStreet();
            formattedAddress += "\n";
            if (getCity() != null) formattedAddress += getCity();
            if (getState() != null) formattedAddress += " " + getState();
            if (getPostalCode() != null) formattedAddress += " " + getPostalCode();
            return formattedAddress;
        }
    }
}