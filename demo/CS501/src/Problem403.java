public class Problem403 {
        public static void main(String[] args) {
            final double Earth_radious = 6371.01;
            double s;
            double chaX = 35.2270869;
            double chaY = -80.8431267;
            double atlX = 33.7489954;
            double atlY = -84.3879824;
            double savX = 32.0835407;
            double savY = -81.0998342;
            double orlX = 28.5383355;
            double orlY = -81.3792365;

            double distanceChaAtl = Earth_radious *
                    Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(atlX)) +
                            Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(chaY - atlY)));
            double distanceAtlOrl = Earth_radious *
                    Math.acos(Math.sin(Math.toRadians(atlX)) * Math.sin(Math.toRadians(orlX)) +
                            Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(atlY - orlY)));
            double distanceOrlSav = Earth_radious *
                    Math.acos(Math.sin(Math.toRadians(orlX)) * Math.sin(Math.toRadians(savX)) +
                            Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(orlY - savY)));
            double distanceSavCha = Earth_radious *
                    Math.acos(Math.sin(Math.toRadians(savX)) * Math.sin(Math.toRadians(chaX)) +
                            Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(savY - chaY)));
            double distanceChaOrl = Earth_radious *
                    Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(orlX)) +
                            Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(chaY - orlY)));

            s = (distanceChaAtl + distanceAtlOrl + distanceChaOrl) / 2;
            double areaChaAtlOrl = Math.pow(s * (s - distanceChaAtl) * (s - distanceAtlOrl) * (s - distanceChaOrl), 0.5);
            s = (distanceOrlSav + distanceSavCha + distanceChaOrl) / 2;
            double areaChaOrlSav = Math.pow(s * (s - distanceOrlSav) * (s - distanceSavCha) * (s - distanceChaOrl), 0.5);

            double areaChaAtlOrlSav = areaChaAtlOrl + areaChaOrlSav;
            System.out.println("The estimated area enclosed by these four cities is " + areaChaAtlOrlSav);
        }
    }



