/* This simple enum determines the gravity of the board.
 * Eventually, we will want to be changing the gravity during the game logic step.
 * all the tiles will shift in the direction of the gravity until they can't move anymore.
 */
package com.mizzou.acm.android;

public enum Gravity
{
	LEFT, RIGHT, UP, DOWN
}
