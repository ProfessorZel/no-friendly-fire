
package com.raus.noFriendlyFire;

public class CustomizableMessage
{
    public Messages id;
    public String text;
    public String notes;

    public CustomizableMessage(Messages id, String text, String notes)
    {
        this.id = id;
        this.text = text;
        this.notes = notes;
    }
}