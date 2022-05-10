package ood.structure.a;

import ood.structure.a.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    /*public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }*/

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
