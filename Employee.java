/*

using UnityEngine;

using System.Collections;

/// <summary>
/// Activates the Bomber Bee when the player comes near it
/// </summary>
public class BeeActivator : MonoBehaviour
        {
public GameObject bee;					// public reference to the bomber bee

        BomberBeeAI bbai;						// the AI engine of the bomber bee

        void Start ()
        {
        bbai = bee.GetComponent<BomberBeeAI>();
        }


        void OnTriggerEnter2D(Collider2D other)
        {
        if(other.gameObject.CompareTag("Player"))
        {
        bbai.ActivateBee(other.gameObject.transform.position);
        }
        }
        }
        */