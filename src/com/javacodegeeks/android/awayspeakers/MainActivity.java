package com.javacodegeeks.android.awayspeakers;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class MainActivity extends ExpandableListActivity{
	
	private ArrayList<String> parentItems = new ArrayList<String>();
	private ArrayList<Object> childItems = new ArrayList<Object>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		

		ExpandableListView expandableList = getExpandableListView(); // you can use (ExpandableListView) findViewById(R.id.list)
		
		expandableList.setDividerHeight(2);
		expandableList.setGroupIndicator(null);
		expandableList.setClickable(true);

		setGroupParents();
		setChildData();

		ExpandableAdapter adapter = new ExpandableAdapter(parentItems, childItems);
		
		adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
		expandableList.setAdapter(adapter);
		expandableList.setOnChildClickListener(this);

        Intent intent = new Intent(MainActivity.this, SimpleVideoPlayerActivity.class);
        startActivity(intent);
	}

	public void setGroupParents() {
		parentItems.add("Sanjiva Weerawarana");
		parentItems.add("Kiran Chandra");
		parentItems.add("eesta Setalvad");
		parentItems.add("Smita Gupta");
		parentItems.add("Dr. Yogesh Jain");
		parentItems.add("Sumangala Damodaran");
	}

	public void setChildData() {
		
		ArrayList<String> child = new ArrayList<String>();
		child.add("Building a successful open source based business\nDr.Sanjiva Weerawarana is the CEO and Chairman of WSO2, a middleware enterprise firm that operates entirely through an open source platform. Having worked with IBM for over eight years, he is one of the founders of their Web services platform. Sanjiva has also founded the Lanka Software Foundation, a non-profit organisation that promotes open source development.At the Away Day, Sanjiva will be talking to us about Frugal Innovation and his experiences while building WSO2, an OSS business in the Global South.");
		childItems.add(child);
		
		
		child = new ArrayList<String>();
		child.add("Using open source software for society’s benefit\nKiran Chandra is the general secretary of the Free Software Movement of India. He is also the founding member of Swecha, an initiative that works on developing and building free software infrastructure on a movement mode.He has also been associated with policy level changes in imparting free software based computer education in schools, building and incubating FOSS models.Kiran will be talking to us about using open source software for the benefit of society. As an active proponent of Digital Freedom, he will share his insights into the current situation on technology and the Indian Government. Kiran will also talk about his efforts to persuade the Indian Government to maintain its progressive stance on software patents.");
		childItems.add(child);
		
		child = new ArrayList<String>();
		child.add("Fighting communal forces\nTeesta is an active communal rights activist, who has been working in mainstream media for over twenty years. She is also one of the founders of ‘Women in the media community’ and ‘Journalists against Communalism’ groups. Teesta has also initiated Project Khoj, which aims to rewrite sections of the Indian textbooks and remove the ‘anti-minority’ prejudices.Teesta will be talking to us about activism and fighting the communal forces in India. She will bring with her, invisible stories of people who are not usually represented in the mainstream media.");
		childItems.add(child);
		
		
		child = new ArrayList<String>();
		child.add("India’s recent economic development and predictors\nSmita Gupta is a senior economist at the Institute of Human Development. She has worked extensively in the field of growth and development in the Indian economy.Smita will be sharing her insights into the other side of the economic development in India, and giving her inputs on the Food Security bill and the Land Acquisition bill. She will also talk about how the government measures progress, and understanding genuine progress indicators.");
		childItems.add(child);


        child = new ArrayList<String>();
		child.add("Healthcare for the underprivileged Detail\nDr. Yogesh Jain is a public health physician at the Jan Swasthya Sahyog, in Bilaspur, Chattisgarh. An MD in Pediatrics from AIIMS, Dr.Jain has been involved in issues of access, cost and quality of healthcare, specifically in hunger and health, and communicable diseases.Dr.Jain will share with us, the JSS story - improving healthcare for the underprivileged in India. As we have worked closely with JSS, he will give us more insight into how technology can help in the field of healthcare.");
		childItems.add(child);

        child = new ArrayList<String>();
		child.add("Music for change\nUnlike the other speakers, Sumangala Damodaran will share her story with us through music. She is a trained Carnatic and Hindustani singer, who has also specialised in Opera singing. Sumangala has been actively involved in archiving and reviving music from the ‘Indian People’s Theatre Association’ - a group that was formed before Independence. She has compiled some of her best work in the album ‘Songs of Protest’ and will be performing for us at the Away Day. She will be accompanied with Varun Gupta on tabla/percussion, Pritam Ghoshal on Sarod and Mark Aranha on guitar.");
		childItems.add(child);
	}

}