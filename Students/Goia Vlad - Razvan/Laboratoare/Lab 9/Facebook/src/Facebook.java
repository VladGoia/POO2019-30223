public class Facebook {
    public static void main(String[] args) {
        Person person0 = new Person("Vlad", "Goia", "Cluj-Napoca", 20);
        Person person1 = new Person("Raul", "Garbou", "Cluj-Napoca", 19);
        Person person2 = new Person("Radu", "Bouaru", "Radauti", 19);
        Person person3 = new Person("Malin", "Mihut", "Deva", 21);
        Person person4 = new Person("Diana", "Trifu", "Deva", 28);
        Person person5 = new Person("Dragos", "Crecan", "Gherla", 22);
        Person person6 = new Person("Gabriela", "Ilies", "Gherla", 19);
        Person person7 = new Person("Alin", "Georgiu", "Dej", 25);
        Person person8 = new Person("Radu", "Iosif", "Gherla", 17);

        person0.setFacebookAccount();

        person0.getFacebookAccount().addFriend(person1);
        person0.getFacebookAccount().addFriend(person2);
        person0.getFacebookAccount().addFriend(person3);
        person0.getFacebookAccount().addFriend(person4);
        person0.getFacebookAccount().printFriends();

        person0.getFacebookAccount().searchFriendsByLocation("Dej");
        person0.getFacebookAccount().searchFriendsByLocation("Deva");
        person0.getFacebookAccount().searchFriendsByLocation("Gherla");

        person0.getFacebookAccount().removeFriend(person7);
        person0.getFacebookAccount().printFriends();

        person0.getFacebookAccount().removeFriend(person1);
        person0.getFacebookAccount().addFriend(person5);
        person0.getFacebookAccount().addFriend(person6);
        person0.getFacebookAccount().addFriend(person7);

        person0.getFacebookAccount().searchFriendsByLocation("Radauti");
        person0.getFacebookAccount().searchFriendsByLocation("Cluj");
        person0.getFacebookAccount().searchFriendsByLocation("Gherla");

        person0.getFacebookAccount().printFriends();
    }
}