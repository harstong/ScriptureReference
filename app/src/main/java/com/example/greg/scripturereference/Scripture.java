package com.example.greg.scripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Scripture extends ActionBarActivity {
    private String Book;
    private int Chapter;
    private int Verse;
    public final static String EXTRA_MESSAGE =  "Your favorite Scripture is: ";
    public int getVerse() {
        return Verse;
    }

    public void setVerse(int verse) {
        Verse = verse;
    }

    public int getChapter() {
        return Chapter;
    }

    public void setChapter(int chapter) {
        Chapter = chapter;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scripture, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayScripture(View view) {
        Intent intent = new Intent(this, displayScripture.class);
        EditText Chapter = (EditText) findViewById(R.id.Chapter);
        EditText Book = (EditText) findViewById(R.id.Book);
        EditText Verse = (EditText) findViewById(R.id.Verse);
        String message = Book.getText().toString() + " " + Chapter.getText().toString() + ":" + Verse.getText().toString();
        System.out.println(message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
