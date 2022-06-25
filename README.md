# Vivek's App

Here I have made an app using **Java**. 

It is a *Vivek's App* where the user will give their data and will get their data and show the **_Data_** 

1. You need to install Android Studion from [here](https://www.python.org/downloads/)
3. And the total Requirements is full filled.

### Important Instructions :

* The User has to give some data.

Reference Code : 
```python
public List<UserModelClass> getUserList() {
	String sql = "select * from " + TABLE_NAME;
	sqLiteDatabase = this.getReadableDatabase();
	List<UserModelClass> storeEmployee = new ArrayList<>();
	Cursor cursor = sqLiteDatabase.rawQuery(sql, null);
	if (cursor.moveToFirst()) {
    		do {
			int id = Integer.parseInt(cursor.getString(0));
			String name = cursor.getString(1);
			String city = cursor.getString(2);
			String gender = cursor.getString(3);
			String password = cursor.getString(4);
			storeEmployee.add(new UserModelClass(id, name, city, gender, password));
		} 
		while (cursor.moveToNext());
	}
	cursor.close();
	return storeEmployee;
}
```

Reference Images : <br>
	<br><img src="app/src/main/res/drawable/ss.jpg" alt="drawing" width="300" height="500"/>

This is the README file for Login repository. [^1]

[^1]: By : Vivek Padia.
