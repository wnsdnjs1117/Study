package Ex03;

public abstract class Weapon {
    public abstract void attack();
}

class Knife extends Weapon {
    @Override
    public void attack() { /* 칼을 휘두른다. */ }
}

class Pistol extends Weapon {
    public void attack() { /* 권총을 쏜다. */ }
}

class Snipe extends Weapon {
    public void attack() { /* 저격총을 쏜다. */ }

    public void rightclick() { /* 조준경으로 확대해서 본다. */ }
}