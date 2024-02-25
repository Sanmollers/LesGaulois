#! /bin/sh
git config --global user.name "Sanmollers"
git config --global user.email mollersjean0@gmail.com
echo "Connected as Sanmollers ! \n"
echo "Entrez le message du commit entre \"\" puis la touche Entrer ou la touche Entrer pour l'envoyer en urgence."
if [ $# -eq 0 ]
then
 git add . | git commit -m "push en urgence à relire !" | git push
 echo "push en urgence à relire !"
else
 git add . | git commit -m "$1" | git push
 echo "Votre projet a bien ete \"push\" !"
fi