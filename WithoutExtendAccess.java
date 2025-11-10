package batch59;

import packageTwo.RelationAccessModifier;

public class WithoutExtendAccess {
public static void main(String[] args) {
	RelationAccessModifier obj = new RelationAccessModifier();
	obj.publicMethodOne();
//	obj.privateMethodOne();

}

}
