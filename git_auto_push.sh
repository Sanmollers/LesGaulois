#! /bin/sh
git config user.name "Sanmollers"
git config user.email mollersjean0@gmail.com
echo "Connection as Sanmollers... \n"
echo "Entrez le message du commit entre \"\" puis la touche Entrer ou la touche Entrer pour l'envoyer en urgence."
if [ $# -eq 0 ]
then
 git add . | git commit -m "push en urgence � relire !" | git push
 echo "push en urgence � relire !"
else
 git add . | git commit -m "$1" | git push
 echo "Votre projet a bien ete \"push\" !"
fi