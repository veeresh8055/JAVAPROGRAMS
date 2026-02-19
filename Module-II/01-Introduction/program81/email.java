class email {
    String sender;
    String reciever;
    String subject;
    String description;

    public email(String sender, String reciever, String subject, String description) {
        this.sender = sender;
        this.reciever = reciever;
        this.subject = subject;
        this.description = description;
    }

    void send() {
        System.out.println("sender : " + sender);
        System.out.println("reciever : " + reciever);
        System.out.println("subject : " + subject);
        System.out.println("Description : " + description);

    }
}

// email
// file
// reciept
// debit card
// userProfile
// // mobile battary
