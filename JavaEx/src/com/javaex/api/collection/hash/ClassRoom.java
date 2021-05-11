package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject;
	private String roomName;

	//	������
	public ClassRoom(String subject) {
		this.subject = subject;
	}

	public ClassRoom(String subject,
					String roomName) {
		this(subject);
		this.roomName = roomName;
	}

	//	ContainsValue
	//	��ü�� ��� ��
	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject) &&
					roomName.equals(other.roomName);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}


}