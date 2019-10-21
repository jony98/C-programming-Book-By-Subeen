package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Eight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় আট");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView =  findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"post hentry\">\n" +
                        "<a name=\"7109853667947926282\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় আট] বাইনারি সার্চ।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-7109853667947926282\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\"><div style=\"text-align: justify;\">একটি সহজ খেলা দিয়ে শুরু করা যাক। এটি খেলতে দুজন দরকার। একজন মনে মনে একটি সংখ্যা ধরবে। আর দ্বিতীয়জন কিছু প্রশ্ন করে সেই সংখ্যাটি বের করবে। তবে 'তোমার সংখ্যাটি কত?' - এমন প্রশ্ন কিন্তু সরাসরি করা যাবে না। প্রশ্নটি হচ্ছে:</div><div style=\"text-align: justify;\">সংখ্যাটি কি N (একটি সংখ্যা)-এর চেয়ে বড়, ছোট নাকি সমান?</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আর সংখ্যাটি কিন্তু একটি নির্দিষ্ট সীমার মধ্যে হতে হবে (যেমন 1 থেকে 100, 10 থেকে 1000, -1000 থেকে 100000)।</div><div style=\"text-align: justify;\">এখন ধরা যাক, প্রথমজন যে সংখ্যাটি ধরেছে সেটি 1 থেকে 1000-এর ভেতর একটি সংখ্যা। তাহলে কিন্তু সর্বোচ্চ এক হাজার বার 'সংখ্যাটি কি N-এর সমান?' প্রশ্নটি করে সেটি বের করে ফেলা যায়। (সংখ্যাটি কি 1? সংখ্যাটি কি 2? ... সংখ্যাটি কি 999?, সংখ্যাটি কি 1000?)। এভাবে প্রশ্ন করতে থাকলে সংখ্যাটি অবশ্যই বের হবে। তবে ভাগ্য খারাপ হলে এক হাজার বার ওই প্রশ্নটি করতে হবে। </div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">কিন্তু আমাদের তো এত সময় নেই। ধরা যাক, 1 থেকে 1000-এর ভেতর ওই সংখ্যাটি হচ্ছে 50। তাহলে আমাদের প্রথম প্রশ্ন হবে:</div><div style=\"text-align: justify;\">১) সংখ্যাটি কি 500-এর চেয়ে বড়, ছোট নাকি সমান? ছোট।</div><div style=\"text-align: justify;\">২) সংখ্যাটি কি 250-এর চেয়ে বড়, ছোট নাকি সমান? ছোট।</div><div style=\"text-align: justify;\">৩) সংখ্যাটি কি 125-এর চেয়ে বড়, ছোট নাকি সমান? ছোট।</div><div style=\"text-align: justify;\">৪) সংখ্যাটি কি 62-এর চেয়ে বড়, ছোট নাকি সমান? ছোট।</div><div style=\"text-align: justify;\">৫) সংখ্যাটি কি 31-এর চেয়ে বড়, ছোট নাকি সমান? বড়।</div><div style=\"text-align: justify;\">৬) সংখ্যাটি কি 46-এর চেয়ে বড়, ছোট নাকি সমান? বড়।</div><div style=\"text-align: justify;\">৭) সংখ্যাটি কি 54-এর চেয়ে বড়, ছোট নাকি সমান? ছোট।</div><div style=\"text-align: justify;\">৮) সংখ্যাটি কি 50-এর চেয়ে বড়, ছোট নাকি সমান? সমান।</div><div style=\"text-align: justify;\">আমরা মাত্র আটটি প্রশ্ন করেই সংখ্যাটি পেয়ে গেছি!</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">তোমরা নিশ্চয়ই পদ্ধতিটি বুঝে ফেলেছ? প্রতিবার প্রশ্ন করে সংখ্যাটি যে সীমার মধ্যে আছে তাকে অর্ধেক করে ফেলা হয়েছে। খেলা শুরুর সময় সীমাটি ছিল 1 থেকে 1000। তারপর সেটি হয়েছে 1 থেকে 500। তারপর 1 থেকে 250, 1 থেকে 125, 1 থেকে 62, 31 থেকে 62, 46 থেকে 62, 46 থেকে 54।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">সংখ্যা খুঁজে বের করার এই পদ্ধতিকে বলে বাইনারি সার্চ। চলো আমরা তাহলে অ্যালগরিদমটি লিখার চেষ্টা করি:</div><div style=\"text-align: justify;\"><b>বাইনারি সার্চ</b> (low, high, N): (শুরুতে আমাদের তিনটি সংখ্যা জানতে হবে, সংখ্যাটির নিম্নসীমা (low), উচ্চসীমা (high) এবং সেই সংখ্যা (N))</div><div style=\"text-align: justify;\">ধাপ 1: mid = (low + high) / 2</div><div style=\"text-align: justify;\">ধাপ 2: যদি mid এবং N-এর মান সমান হয় তবে ধাপ 5-এ যাও। </div><div style=\"text-align: justify;\">ধাপ 3: যদি N, mid-এর চেয়ে বড় হয়, তাহলে low = mid + 1. ধাপ 1-এ যাও।</div><div style=\"text-align: justify;\">ধাপ 4: যদি N, mid-এর চেয়ে ছোট হয়, তাহলে high = mid - 1. ধাপ 1-এ যাও।</div><div style=\"text-align: justify;\">ধাপ 5: সংখ্যাটি পেয়ে গেছি (mid)।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এখন আমরা দেখব একটি অ্যারে থেকে কীভাবে বাইনারি সার্চ করে কোনো সংখ্যা খুঁজে বের করতে হয়। অ্যারেতে কিন্তু সংখ্যাগুলো ছোট থেকে বড় কিংবা বড় থেকে ছোট ক্রমানুসারে থাকতে হবে। নইলে বাইনারি সার্চ ব্যবহার করা যাবে না। কারণটি কি কেউ বলতে পারো?</div><div style=\"text-align: justify;\">প্রথমে আমরা একটি ইন্টিজার অ্যারে নিই যেখানে সংখ্যাগুলো ছোট থেকে বড় ক্রমানুসারে সাজানো আছে।</div><div style=\"text-align: justify;\">int ara[] = {1, 4, 6, 8, 9, 11, 14, 15, 20, 25, 33 83, 87, 97, 99, 100};</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এখন বলো তো low আর high-এর মান কত হবে? low = 1 এবং high = 100 ? ঠিকই ধরেছ কিন্তু এখানে একটু সমস্যা আছে। আমরা এখানে  সব সংখ্যার মধ্যে খুঁজব না, বরং অ্যারের ইনডেক্সের মধ্যে খুঁজব। আর অ্যারের ইনডেক্সগুলো ক্রমানুসারে থাকে বলেই অ্যারেতে বাইনারি সার্চ করা যায়। এখানে ara-এর সর্বনিম্ন ইনডেক্স হচ্ছে 0 এবং সর্বোচ্চ ইনডেক্স হচ্ছে 15। তাহলে আমরা দুটি ভেরিয়েবলের মান নির্দিষ্ট করে দিই -</div><div style=\"text-align: justify;\">low_indx = 0;</div><div style=\"text-align: justify;\">high_indx = 15;</div><div style=\"text-align: justify;\">যে সংখ্যাটি খুঁজব ধরা যাক সেটি হচ্ছে 97।</div><div style=\"text-align: justify;\">num = 97;</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">তোমাদের অনেকেই হয়তো ভাবছ, num সংখ্যাটি যদি ara-তে না থাকে তখন কী হবে? সেটিও আমরা দেখব। সংখ্যাটি যদি খুঁজে পাওয়া না যায় তবে সেটি জানিয়ে দেওয়ার ব্যবস্থা রাখতে হবে আমাদের প্রোগ্রামে।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আমাদের যেহেতু খোঁজার কাজটি বারবার করতে হবে, আমাদেরকে একটি লুপ ব্যবহার করতে হবে। লুপের ভেতর আমরা খোঁজাখুঁজি করব আর সংখ্যাটি পেয়ে গেলে (কিংবা সংখ্যাটি নেই সেটি নিশ্চিত হলে) আমরা লুপ থেকে বের হয়ে যাব।</div><pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> while(1) {  \n" +
                        "     mid_indx = (low_indx + high_indx) / 2;       \n" +
                        "     if(num == ara[mid_indx]) {  \n" +
                        "         /* num যদি ara[mid_indx]-এর সমান হয়, তবে সেটি আমরা পেয়ে গেছি */  \n" +
                        "         break;  \n" +
                        "     }       \n" +
                        "     if(num &lt; ara[mid_indx]) {       \n" +
                        "         /* num যদি ara[mid_indx]-এর ছোট হয়, তবে আমরা low_indx থেকে mid_indx – 1 সীমার মধ্যে খুঁজব। */  \n" +
                        "         high_indx = mid_indx – 1;  \n" +
                        "     }  \n" +
                        "     else {  \n" +
                        "         /* num যদি ara[mid_indx]-এর বড় হয়, তবে আমরা mid_indx + 1 থেকে high_indx সীমার মধ্যে খুঁজব। */  \n" +
                        "         low_indx = mid_indx + 1;  \n" +
                        "     }  \n" +
                        " }  \n" +
                        "</code></pre><div style=\"text-align: justify;\">বাইনারি সার্চের প্রোগ্রাম আমরা লিখে ফেললাম। খুবই সহজ-সরল প্রোগ্রাম। সংখ্যাটি খুঁজে না পাওয়া পর্যন্ত লুপটি চলতেই থাকবে, কারণ আমরা লিখেছি while(1) আর 1 সব সময় সত্যি। কিন্তু সংখ্যাটি যদি ara-তে না থাকে তবে লুপটি চলতেই থাকবে এবং আমাদের প্রোগ্রাম কখনো বন্ধ হবে না। সুতরাং একটা ব্যবস্থা করা দরকার। আচ্ছা, আমরা কীভাবে বুঝব যে সংখ্যাটি ara-তে নেই? তোমরা ইতিমধ্যে লক্ষ করেছ যে আমরা প্রতিবার সার্চের সীমাটা অর্ধেক করে ফেলি। এভাবে চলতে থাকলে একসময় ওই সীমার ভেতর একটি সংখ্যাই থাকবে। তখন low এবং high-এর মান সমান হবে। আর প্রতিবার যেহেতু হয় low-এর মান বাড়ছে নাহয় high-এর মান কমছে, সুতরাং যেবার low আর high সমান হবে, তার পরের বার low-এর মান high-এর মানের চেয়ে বেশি হবে। তখন আমরা বুঝব যে সংখ্যাটি খুঁজে পাওয়া যায়নি। সুতরাং যতক্ষণ low &lt;= high ততক্ষণ লুপটি চলবে। লুপ থেকে বের হয়ে যদি দেখি low &gt; high, তখন বুঝব যে সংখ্যাটি খুঁজে পাওয়া যায়নি, আর না হলে বুঝব সংখ্যাটি খুঁজে পাওয়া গেছে এবং-এর মান ara[mid_indx]।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">তাহলে পুরো প্রোগ্রামটি এবারে লিখে ফেলা যাক:</div><pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int ara[] = {1, 4, 6, 8, 9, 11, 14, 15, 20, 25, 33 83, 87, 97, 99, 100};  \n" +
                        "     int low_indx = 0;  \n" +
                        "     int high_indx = 15;  \n" +
                        "     int mid_indx;  \n" +
                        "     int num = 97;  \n" +
                        "     while (low_indx &lt;= high_indx) {  \n" +
                        "         mid_indx = (low_indx + high_indx) / 2;  \n" +
                        "         if (num == ara[mid_indx]) {  \n" +
                        "             break;  \n" +
                        "         }  \n" +
                        "         if (num &lt; ara[mid_indx]) {  \n" +
                        "             high_indx = mid_indx – 1;  \n" +
                        "         }  \n" +
                        "         else {  \n" +
                        "             low_indx = mid_indx + 1;  \n" +
                        "         }  \n" +
                        "     }  \n" +
                        "     if (low_indx &gt; high_indx) {  \n" +
                        "         printf(\"%d is not in the array\\n\", num);  \n" +
                        "     }  \n" +
                        "     else {  \n" +
                        "         printf(\"%d is found in the array. It is the %d th element of the array.\\n\", ara[mid_indx], mid_indx);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৮.১  \n" +
                        "</code></pre><div style=\"text-align: justify;\">এবার তোমাদের কাজ হবে বাইনারি সার্চের জন্য একটি আলাদা ফাংশন লেখা।<br>\n" +
                        "<br>\n" +
                        "আর বাইনারি সার্চ কীভাবে কাজ করে, সেটি এখানে সুন্দর করে অ্যানিমেশনের মাধ্যমে বোঝানো হয়েছে:<br>\n" +
                        "<a href=\"http://video.franklin.edu/Franklin/Math/170/common/mod01/binarySearchAlg.html\">http://video.franklin.edu/Franklin/Math/170/common/mod01/binarySearchAlg.html</a></div></div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
