package usb;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        Principal p = new Principal();
        int w = lector.nextInt();
        int h = lector.nextInt();
        int x0 = lector.nextInt();
        int y0 = lector.nextInt();
        String spell = lector.next();
        int level = lector.nextInt();
        int cx = lector.nextInt();
        int cy = lector.nextInt();
        p.Comunicador(w, h, x0, y0, cx, cy, level, spell);
        
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageF = 200;
                Integer damageW = 300;
                Integer damageE = 400;
                Integer damageA = 100;
                if (spell.toUpperCase().equalsIgnoreCase("FIRE")) {
                    while (level <= 3) {
                        switch (level) {
                            case 1:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = 0);
                                    level = 0;
                                    break;
                                } else {
                                    System.out.println(damageF = damageF + 20);
                                    
                                }
                                break;
                            case 2:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = damageF + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageF = damageF + 30);
                                    level = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = damageF + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageF = damageF + 50);
                                    level = 0;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }  
        }   
    }

    public void fire(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageF = 200;
                Integer damageW = 300;
                Integer damageE = 400;
                Integer damageA = 100;
                if (spell.toUpperCase().equalsIgnoreCase("FIRE")) {
                    while (level <= 3) {
                        switch (level) {
                            case 1:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = 0);
                                    level = 0;
                                    break;
                                } else {
                                    System.out.println(damageF = damageF + 20);
                                    
                                }
                                break;
                            case 2:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = damageF + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageF = damageF + 30);
                                    level = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageF = damageF + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageF = damageF + 50);
                                    level = 0;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public void water(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageW = 300;
                if (spell.toUpperCase().equalsIgnoreCase("WATER")) {
                    while (level <= 3) {
                        switch (level) {
                            case 1:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageW = 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageW = damageW + 10);
                                    level = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageW = damageW + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageW = damageW + 25);
                                    level = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageW = damageW + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageW = damageW + 40);
                                    level = 0;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public void earth(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageE = 400;
                if (spell.toUpperCase().equalsIgnoreCase("EARTH")) {
                    while (level <= 3) {
                        switch (level) {
                            case 1:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageE = 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageE = damageE + 25);
                                    level = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageE = damageE + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageE = damageE + 55);
                                    level = 0;
                                }
                                break;
                            case 3:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageE = damageE + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageE = damageE + 70);
                                    level = 0;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public void air(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageA = 100;
                if (spell.toUpperCase().equalsIgnoreCase("AIR")) {
                    while (level <= 3) {
                        switch (level) {
                            case 1:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageA = 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageA = damageA + 18);
                                    level = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageA = damageA + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageA = damageA + 38);
                                    level = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageA = damageA + 0);
                                    level = 0;
                                } else {
                                    System.out.println(damageA = damageA + 60);
                                    level = 0;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    private void Comunicador(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        if (spell.equalsIgnoreCase("Fire")) {
            fire(w, h, x0, y0, cx, cy, level, spell);
        } else if (spell.equalsIgnoreCase("Water")) {
            water(w, h, x0, y0, cx, cy, level, spell);
        } else if (spell.equalsIgnoreCase("Earth")) {
            earth(w, h, x0, y0, cx, cy, level, spell);
        } else {
            air(w, h, x0, y0, cx, cy, level, spell);
        }
    }
}
